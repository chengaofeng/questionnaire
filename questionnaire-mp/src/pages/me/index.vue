<template>
	<view class="content">
		<image class="logo" src="/static/logo.png"></image>
		<view>
			<text class="title">{{title}}</text>
		</view>
		<button open-type="getUserInfo" @click="getuserinfo">登录</button>

	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello component',
			}
		},
		methods:{
			getuserinfo: function(){
				console.log("获取用户信息");
				// wx登录
				wx.login({
					success (res) {
						if (res.code) {
							//发起网络请求
							var code = res.code
							// 获取微信用户信息
							wx.getUserInfo({
								success: function(res) {
									console.log(res)
									var userInfo = res.userInfo
									var nickName = userInfo.nickName
									console.log(userInfo.openId);
									var avatarUrl = userInfo.avatarUrl
									var gender = userInfo.gender //性别 0：未知、1：男、2：女
									var province = userInfo.province
									var city = userInfo.city
									var country = userInfo.country
								},
								fail:res=>{
									// 获取失败的去引导用户授权
									console.log("获取用户信息失败");
								}
							})

						}
					}
				})
			}
		}
	}
</script>

<style>
	.content {
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
	}

	.logo {
		height: 200rpx;
		width: 200rpx;
		margin: 200rpx auto 50rpx auto;
	}

	.text-area {
		display: flex;
		justify-content: center;
	}

	.title {
		font-size: 36rpx;
		color: #8f8f94;
	}
</style>
