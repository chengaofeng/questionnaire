<template>
    <div class="hello">H {{who}}</div>
</template>

<script>
    module.exports = {
        data: function() {
            return {
                who: 'wos'
            }
        }
    }
</script>

<style>
    .hello {
        background-color: #ffe;
    }
</style>
