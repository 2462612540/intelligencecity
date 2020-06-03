$(document).ready(function() {
    $('#table_id')
        .DataTable(
            {
                "paging": true,
                "iDisplayLength": 5, //默认每页数量
                //"bPaginate": true, //翻页功能
                "bLengthChange": true, //改变每页显示数据数量
                "bFilter": true, //过滤功能
                "bSort": true, //排序功能
                "bInfo": true, //页脚信息
                "bAutoWidth": true, //自动宽度
                "bRetrieve": true,
                "processing": true,
                //"serverSide" : true,//服务器端进行分页处理的意思
                "bPaginate": true,
                //"bProcessing": true
                // "ajax": {
                //     url: "../serviceConfig/getServiceConfigByModel.do",
                //     dataSrc: function(result) {
                //         //这里result和上面jquery的ajax的代码类似，也是可以得到data.json的数据，但是这样的格式，Datatables不能直接使用，这时候需要在这里处理一下
                //         //直接返回Datatables需要的那部分数据即可
                //         return result.data.aaData;
                //     }
                // },
                columns : [
                    {
                        data : "{{entity.id}}"
                    },
                    {
                        data : "code"
                    },
                    {
                        data : "srvName"
                    },
                    {
                        data : "url"
                    },
                    {
                        data : "description"
                    },
                    {
                        data : "isAllow"
                    },
                    {
                        data : "state"
                    },
                    {
                        data : "frequency"
                    },
                    {
                        data : "createTime"
                    },
                    {
                        data : "remark"
                    },
                    {
                        data : "isDelete",
                        render : function(
                            data, type,
                            row) {
                            if (data == 0) {
                                return "未删除";
                            } else {
                                return "删除";
                            }

                        }
                    } ],

                "columnDefs" : [ {
                    // 定义操作列,######以下是重点########
                    "targets" : 11,//操作按钮目标列
                    "data" : null,
                    "render" : function(data,type, row) {
                        var id = '"' + row.id+ '"';
                        //<a href='javascript:void(0);'  class='delete btn btn-default btn-xs'  ><i class='fa fa-times'></i> 查看</a>
                        var html = "<button class='btn btn-xs btn-success' οnclick='add()'><i class='icon-ok'></i> </button>"
                        html += "<button class='btn btn-xs btn-warning' οnclick='edit("
                            + id
                            + ")'><i class='icon-pencil'></i> </button>"
                        html += "<button class='btn btn-xs btn-danger' οnclick='del("
                            + id
                            + ")'><i class='icon-remove'></i> </button>"
                        return html;
                    }
                } ]
            });
});