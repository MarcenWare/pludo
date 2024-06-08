import { createRouter, createWebHistory, RouteRecordRaw } from "vue-router";

const routes: Array<RouteRecordRaw> = [
    {
        path: "/",
        name: "Root",
        components: {
            default: () => import("@/views/Entry.vue"),
        },
    },
    {
        path: "/preview",
        name: "DynamicPreview",
        components: {
            default: () => import("@/views/Models.vue"),
        },
    },
    {
        path: "/dev",
        name: "Development",
        components: {
            default: () => import("@/views/devMenu.vue"),
        },
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
