<script setup lang="ts">
import { Cylinder, Group, Sphere, ToonMaterial } from "troisjs";
</script>

<template>
    <Group :position="{ y: 1.5 }">
        <Sphere
            :radius="0.65"
            :position="{ y: 1.2 }"
            :width-segments="24"
            :height-segments="24"
        >
            <ToonMaterial :color="'#df30ca'" />
        </Sphere>
        <Cylinder
            :radial-segments="50"
            :radius-top="0"
            :radius-bottom="1"
            :height="3"
        >
            <ToonMaterial :color="'#df30ca'" />
        </Cylinder>
    </Group>
</template>
