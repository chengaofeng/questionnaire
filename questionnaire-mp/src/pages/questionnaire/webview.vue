<template>
    <view>
        <web-view :src="url"></web-view>
    </view>
</template>

<script>
    export default {
        name: 'webview',
        data() {
            return {
                url: ''
            }
        },
        created() {
            console.log("webview created")
        },
        onLoad(e) {
            console.log("webview" + e);
            // 获取传递过来的链接
            this.url = e.url
        }
    }
</script>
