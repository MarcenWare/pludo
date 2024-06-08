import { createApp } from "troisjs";
import "virtual:uno.css";
import "./main.css";
import "../utils/stompjs"
import router from "@/router";
import App from "@/App.vue";

createApp(App).use(router).mount("#app");
