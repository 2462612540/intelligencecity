//服务层
app.service('commonuserService',function($http){
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../commonuser/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../commonuser/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../commonuser/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		alert("已经到了servicec层的代码")
		return  $http.post('../commonuser/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../commonuser/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../commonuser/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../commonuser/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
});
