<template>
  <div class="regist">
    <h1 class="underline">SSAFY 게시글 작성</h1>
    <div class="regist_form">
      <label for="subject">제목</label>
      <input type="text" id="subject" v-model="subject" ref="subject" /><br />
      <label for="content">내용</label>
      <br />
      <textarea
        id="content"
        v-model="content"
        ref="content"
        cols="35"
        rows="5"></textarea
      ><br />
      <button @click="checkValue">등록</button>
      <button @click="moveList">목록</button>
    </div>
  </div>
</template>

<script>
import http from "@/api/http";
import {mapState} from "vuex";

export default {
  name: "BoardWrite",
  computed: {
    ...mapState(["loginId"]),
  },
  data() {
    return {
      subject: null,
      content: null,
    };
  },
  methods: {
    // 입력값 체크하기 - 체크가 성공하면 registArticle 호출
    checkValue() {
      // 사용자 입력값 체크하기
      // 작성자아이디, 제목, 내용이 없을 경우 각 항목에 맞는 메세지를 출력
      let err = true;
      let msg = "";
      err &&
        !this.subject &&
        ((msg = "제목 입력해주세요"),
        (err = false),
        this.$refs.subject.focus());
      err &&
        !this.content &&
        ((msg = "내용 입력해주세요"),
        (err = false),
        this.$refs.content.focus());

      if (!err) alert(msg);
      // 만약, 내용이 다 입력되어 있다면 registArticle 호출
      else this.registArticle();
    },
    registArticle() {
      let article = {
        userid: this.loginId,
        subject: this.subject,
        content: this.content,
      };
      http.post("/board", article).then(({data}) => {
        console.log(data);
        let msg = "등록 처리시 문제가 발생했습니다.";
        if (data === "success") msg = "글등록이 완료되었습니다.";
        alert(msg);
        this.moveList();
      });
    },

    moveList() {
      this.$router.push({name: "boardlist"});
    },
  },
};
</script>

<style></style>
