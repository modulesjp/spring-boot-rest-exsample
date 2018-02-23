var vue = new Vue({
    el:"#user"
    ,data:{
        datalist:[{id:null,name:null}]
    }
    ,methods:{
        getlist:function () {
            var self=this;
            $.get('/get'
            ,null
            ,function(data){self.datalist=data}
            );
        }
    }
})