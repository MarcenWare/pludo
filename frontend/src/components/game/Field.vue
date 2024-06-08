<script setup lang="ts">
import { Cylinder, Group, ToonMaterial } from "troisjs";

interface Props {
    position: { x: number; z: number };
    color?: string;
}

withDefaults(defineProps<Props>(), {
    color: "#ccc",
});
</script>

<template>
    <Group :position="{ x: position.x, y: 0.1, z: position.z }">
        <Cylinder
            :radius-top="1.5"
            :radius-bottom="1.5"
            :height="0.2"
            :radial-segments="30"
        >
            <ToonMaterial :color="'black'" />
        </Cylinder>
        <Cylinder
            :radius-top="1.35"
            :radius-bottom="1.35"
            :height="0.25"
            :radial-segments="30"
        >
            <ToonMaterial :color="color" />
        </Cylinder>
    </Group>
</template>
