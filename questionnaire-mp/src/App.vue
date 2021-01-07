<script>
    export default {
        onLaunch: function () {
            console.log('App Launch')
            uni.getSetting({
                    success(res) {
                        if (!res.authSetting['scope.userInfo']) {
                            uni.authorize({
                                scope: 'scope.userInfo',
                                success() {
                                    uni.getUserInfo({
                                        success: function (result) {
                                            console.log("获取用户信息")
                                            console.log(result)
                                        }
                                    });
                                },
                                fail(e) {
                                    console.log(e)
                                    console.log("你拒绝了授权，无法获得周边信息")
                                }
                            })
                        }
                    }
                }
                // uni.authorize({
                //     scope: 'scope.userInfo',
                //     success() {
                //         uni.getUserInfo({
                //             success:function (result) {
                //                 console.log("获取用户信息")
                //                 console.log(result)
                //             }
                //         });
                //     },
                //     fail(e){
                //         console.log("获取用户信息失败")
                //         console.log(e)
                //     }
                // })
            )
        },
        onShow: function () {
            console.log('App Show')
        },
        onHide: function () {
            console.log('App Hide')
        }
    }
</script>

<style>
    /*每个页面公共css */
</style>
