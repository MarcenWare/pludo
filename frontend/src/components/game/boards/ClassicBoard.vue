<script setup lang="ts">
import { Box, Group, ToonMaterial } from "troisjs";
import Field from "@/components/game/Field.vue";

const playerColors = ["#e65151", "#93ba69", "#4580a8", "#c8b864"];

const finishFields = [
    {
        positions: [
            { x: 0, z: -20 },
            { x: 0, z: -15 },
            { x: 0, z: -10 },
            { x: 0, z: -5 },
        ],
    },
    {
        positions: [
            { x: -20, z: 0 },
            { x: -15, z: 0 },
            { x: -10, z: 0 },
            { x: -5, z: 0 },
        ],
    },
    {
        positions: [
            { x: 0, z: 20 },
            { x: 0, z: 15 },
            { x: 0, z: 10 },
            { x: 0, z: 5 },
        ],
    },
    {
        positions: [
            { x: 20, z: 0 },
            { x: 15, z: 0 },
            { x: 10, z: 0 },
            { x: 5, z: 0 },
        ],
    },
];

const baseFields = [
    {
        positions: [
            { x: 20, z: -20 },
            { x: 25, z: -20 },
            { x: 20, z: -25 },
            { x: 25, z: -25 },
        ],
    },
    {
        positions: [
            { x: -20, z: -20 },
            { x: -20, z: -25 },
            { x: -25, z: -20 },
            { x: -25, z: -25 },
        ],
    },
    {
        positions: [
            { x: -20, z: 20 },
            { x: -25, z: 20 },
            { x: -20, z: 25 },
            { x: -25, z: 25 },
        ],
    },
    {
        positions: [
            { x: 20, z: 20 },
            { x: 20, z: 25 },
            { x: 25, z: 20 },
            { x: 25, z: 25 },
        ],
    },
];

const startFields = [
    { x: 5, z: -25 },
    { x: 25, z: 5 },
    { x: -5, z: 25 },
    { x: -25, z: -5 },
];

const regularFields = [
    {
        positions: [
            startFields[0],
            { x: 5, z: -20 },
            { x: 5, z: -15 },
            { x: 5, z: -10 },
            { x: 5, z: -5 },
            { x: 10, z: -5 },
            { x: 15, z: -5 },
            { x: 20, z: -5 },
            { x: 25, z: -5 },
            { x: 25, z: 0 },
        ],
    },
    {
        positions: [
            startFields[1],
            { x: 20, z: 5 },
            { x: 15, z: 5 },
            { x: 10, z: 5 },
            { x: 5, z: 5 },
            { x: 5, z: 10 },
            { x: 5, z: 15 },
            { x: 5, z: 20 },
            { x: 5, z: 25 },
            { x: 0, z: 25 },
        ],
    },
    {
        positions: [
            startFields[2],
            { x: -5, z: 20 },
            { x: -5, z: 15 },
            { x: -5, z: 10 },
            { x: -5, z: 5 },
            { x: -5, z: 5 },
            { x: -10, z: 5 },
            { x: -15, z: 5 },
            { x: -20, z: 5 },
            { x: -25, z: 5 },
            { x: -25, z: 0 },
        ],
    },
    {
        positions: [
            startFields[3],
            { x: -20, z: -5 },
            { x: -15, z: -5 },
            { x: -10, z: -5 },
            { x: -5, z: -5 },
            { x: -5, z: -10 },
            { x: -5, z: -15 },
            { x: -5, z: -20 },
            { x: -5, z: -25 },
            { x: 0, z: -25 },
        ],
    },
];
</script>

<template>
    <Group>
        <Box :height="0.1" :width="55" :depth="55">
            <ToonMaterial :color="'#8c8c8c'" />
        </Box>
        <Group>
            <Group v-for="(color, i) of playerColors" :key="color">
                <Field
                    v-for="pos of baseFields[i].positions"
                    :position="pos"
                    :color="color"
                />
                <Field
                    v-for="pos of finishFields[i].positions"
                    :position="pos"
                    :color="color"
                />
            </Group>
        </Group>
        <Group v-for="({ positions }, i) of regularFields" :key="i">
            <Field v-for="pos of positions" :position="pos" />
        </Group>
    </Group>
</template>
