<template>
    <view class="history">
        <view class="list">
            <view
                    class="item"
                    v-for="(item, index) in list"
                    :key="index"
                    @click="itemClick(item)">
                <view class="date">
                    {{item.title}}
                </view>
            </view>
        </view>
	</view>
</template>

<script>
    export default {
        data() {
            return {
                list: [{
                    "title": "陈高峰"
                    , "link": "http://www.baidu.com"
                },
                    {
                        "title": "薛飞"
                        , "link": "http://www.baidu.com"
                    }]
            }
        },
        methods: {
            itemClick(data) {
            	console.log(data);
                // 跳转到内部窗口并且传递链接
                uni.navigateTo({
                    url: `/pages/webview/webview?url=${data.link}`,
					fail:function (e) {
						console.log(e);
					}
                })
            }
        },
        created() {
//异步获取数据啦，没什么好说的
        }
    }
</script>
