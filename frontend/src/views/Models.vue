<script setup lang="ts">
import { Camera, DirectionalLight, Renderer, Scene } from "troisjs";
import PlayerPiece from "@/components/game/PlayerPiece.vue";
import ClassicBoard from "@/components/game/boards/ClassicBoard.vue";
</script>

<template>
    <Renderer
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
</template>
