<script setup lang="ts">
import { Camera, DirectionalLight, Renderer, Scene } from "troisjs";
import ClassicBoard from "@/components/game/boards/ClassicBoard.vue";
import PlayerPiece from "@/components/game/PlayerPiece.vue";

const boardOptions = [{ value: 0, label: "Classic4P" }];
</script>

<template>
    <div :class="['relative']">
        <Renderer
            :class="['absolute']"
            antialias
            :orbit-ctrl="{ enableDamping: true }"
            resize="window"
            shadow
        >
            <Camera :position="{ y: 30, z: 20 }" />
            <Scene>
                <DirectionalLight :position="{ y: 50, z: 50 }" cast-shadow />
                <ClassicBoard />
                <PlayerPiece />
            </Scene>
        </Renderer>
        <div :class="['backdrop-blur-6 h-50']">
            <select>
                <option
                    v-for="opt of boardOptions"
                    :value="opt.value"
                    v-text="opt.label"
                />
            </select>
        </div>
    </div>
</template>
