"use strict";(self["webpackChunkvue3_nb0"]=self["webpackChunkvue3_nb0"]||[]).push([[525],{34525:(e,l,a)=>{a.r(l),a.d(l,{default:()=>H});a(39524),a(30721),a(16158),a(63134),a(33510),a(41808),a(87547),a(8971),a(43448),a(86696),a(40073),a(1680),a(30826),a(3299),a(56505),a(98218),a(68838),a(36507);var n=a(67377),u=a(98479),t=(a(31250),a(51290)),o=a(86754),r=a(54432),i=(a(31818),a(51284),a(75014),a(52443),{class:"formModel_btn_box"});const s={__name:"formModel",emits:["formModelChange"],setup:function(e,l){var a,u=l.expose,o=l.emit,r=null===(a=(0,n.FN)())||void 0===a?void 0:a.appContext.config.globalProperties,s="users",d="管理员",c=(0,t.iH)({}),v=(0,t.iH)({username:!1,password:!1,role:!1}),f=(0,t.iH)(!1),p=(0,t.iH)(!1),m=(0,t.iH)(""),g=(0,t.iH)({username:[{required:!0,message:"请输入",trigger:"blur"}],password:[{required:!0,message:"请输入",trigger:"blur"}],role:[]}),h=(0,t.iH)(null),w=(0,t.iH)(0),_=(0,t.iH)(""),b=function(){c.value={username:"",password:"",role:"管理员"}},k=function(){null===r||void 0===r||r.$http({url:"".concat(s,"/info/").concat(w.value),method:"get"}).then((function(e){new RegExp("../../../file","g");c.value=e.data.data,f.value=!0}))},y=(0,t.iH)(""),W=(0,t.iH)(""),C=(0,t.iH)(""),H=(0,t.iH)(""),U=(0,t.iH)(""),x=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:null,l=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"add",a=arguments.length>2&&void 0!==arguments[2]?arguments[2]:"",n=arguments.length>3&&void 0!==arguments[3]?arguments[3]:null,u=arguments.length>4&&void 0!==arguments[4]?arguments[4]:null,t=arguments.length>5&&void 0!==arguments[5]?arguments[5]:null,o=arguments.length>6&&void 0!==arguments[6]?arguments[6]:null,r=arguments.length>7&&void 0!==arguments[7]?arguments[7]:null;if(b(),e&&(w.value=e,_.value=l),"add"==l)p.value=!0,m.value="新增"+d,f.value=!0;else if("info"==l)p.value=!1,m.value="查看"+d,k();else if("edit"==l)p.value=!0,m.value="修改"+d,k();else if("cross"==l){for(var i in p.value=!0,m.value=a,n)"username"!=i?"password"!=i?"role"!=i||(c.value.role=n[i],v.value.role=!0):(c.value.password=n[i],v.value.password=!0):(c.value.username=n[i],v.value.username=!0);n&&(y.value=n),u&&(W.value=u),o&&(C.value=o),t&&(H.value=t),r&&(U.value=r),c.value.role="管理员",f.value=!0}};u({init:x});var V=function(){f.value=!1},$=function(){W.value;var e=JSON.parse(JSON.stringify(y.value)),l="",a="",n="";if("cross"==_.value&&""!=H.value)if(H.value.startsWith("["))l=null===r||void 0===r?void 0:r.$toolUtil.storageGet("userid"),a=e["id"],n=H.value.replace(/\[/,"").replace(/\]/,"");else{for(var u in e)u==H.value&&(e[u]=U.value);z(e)}h.value.validate((function(e){if(e)if(l&&a){c.value.crossuserid=l,c.value.crossrefid=a;var u={page:1,limit:1e3,crossuserid:c.value.crossuserid,crossrefid:c.value.crossrefid};null===r||void 0===r||r.$http({url:"".concat(s,"/page"),method:"get",params:u}).then((function(e){if(e.data.data.total>=n)return null===r||void 0===r||r.$toolUtil.message("".concat(C.value),"error"),!1;null===r||void 0===r||r.$http({url:"".concat(s,"/").concat(c.value.id?"update":"save"),method:"post",data:c.value}).then((function(e){null===r||void 0===r||r.$toolUtil.message("操作成功","success",(function(){f.value=!1,o("formModelChange")}))}))}))}else null===r||void 0===r||r.$http({url:"".concat(s,"/").concat(c.value.id?"update":"save"),method:"post",data:c.value}).then((function(e){null===r||void 0===r||r.$toolUtil.message("操作成功","success",(function(){f.value=!1,o("formModelChange")}))}))}))},z=function(e){null===r||void 0===r||r.$http({url:"".concat(W.value,"/update"),method:"post",data:e}).then((function(e){}))};return function(e,l){var a=(0,n.up)("el-input"),u=(0,n.up)("el-form-item"),t=(0,n.up)("el-col"),o=(0,n.up)("el-row"),r=(0,n.up)("el-form"),s=(0,n.up)("el-button"),d=(0,n.up)("el-dialog");return(0,n.wg)(),(0,n.iD)("div",null,[(0,n.Wm)(d,{modelValue:f.value,"onUpdate:modelValue":l[3]||(l[3]=function(e){return f.value=e}),title:m.value,width:"80%","destroy-on-close":"",fullscreen:!1},(0,n.Nv)({default:(0,n.w5)((function(){return[(0,n.Wm)(r,{class:"formModel_form",ref_key:"formRef",ref:h,model:c.value,"label-width":"$template2.back.add.form.base.labelWidth",rules:g.value},{default:(0,n.w5)((function(){return[(0,n.Wm)(o,null,{default:(0,n.w5)((function(){return[(0,n.Wm)(t,{span:24},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"用户名",prop:"username"},{default:(0,n.w5)((function(){return[(0,n.Wm)(a,{class:"list_inp",modelValue:c.value.username,"onUpdate:modelValue":l[0]||(l[0]=function(e){return c.value.username=e}),placeholder:"用户名",type:"text",readonly:!(p.value&&!v.value.username)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1}),(0,n.Wm)(t,{span:24},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"密码",prop:"password"},{default:(0,n.w5)((function(){return[(0,n.Wm)(a,{class:"list_inp",modelValue:c.value.password,"onUpdate:modelValue":l[1]||(l[1]=function(e){return c.value.password=e}),placeholder:"密码",type:"password",readonly:!(p.value&&!v.value.password)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1}),(0,n.Wm)(t,{span:24},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"角色",prop:"role"},{default:(0,n.w5)((function(){return[(0,n.Wm)(a,{class:"list_inp",modelValue:c.value.role,"onUpdate:modelValue":l[2]||(l[2]=function(e){return c.value.role=e}),placeholder:"角色",type:"text",readonly:!(p.value&&!v.value.role)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1})]})),_:1})]})),_:1},8,["model","rules"])]})),_:2},[p.value||"logistics"==_.value||"reply"==_.value?{name:"footer",fn:(0,n.w5)((function(){return[(0,n._)("span",i,[(0,n.Wm)(s,{class:"formModel_cancel",onClick:V},{default:(0,n.w5)((function(){return[(0,n.Uk)("取消")]})),_:1}),(0,n.Wm)(s,{class:"formModel_confirm",type:"primary",onClick:$},{default:(0,n.w5)((function(){return[(0,n.Uk)(" 提交 ")]})),_:1})])]})),key:"0"}:void 0]),1032,["modelValue","title"])])}}};var d=a(57326);const c=(0,d.Z)(s,[["__scopeId","data-v-5e659e0c"]]),v=c;var f=function(e){return(0,n.dD)("data-v-074c36de"),e=e(),(0,n.Cn)(),e},p={class:"app-contain"},m={class:"list_search_view"},g={class:"search_view"},h=f((function(){return(0,n._)("div",{class:"search_label"}," 用户名： ",-1)})),w={class:"search_box"},_={class:"search_btn_view"},b=f((function(){return(0,n._)("br",null,null,-1)})),k={class:"btn_view"},y=f((function(){return(0,n._)("br",null,null,-1)}));const W={__name:"list",setup:function(e){var l,a=null===(l=(0,n.FN)())||void 0===l?void 0:l.appContext.config.globalProperties,i="users",s="管理员";(0,o.yj)();(0,n.bv)((function(){}));var d=(0,t.iH)(null),c=(0,t.iH)(null),f=(0,t.iH)({page:1,limit:20,sort:"id",order:"desc"}),W=(0,t.iH)({}),C=(0,t.iH)([]),H=(0,t.iH)(!1),U=function(e){(0,n.Y3)((function(){c.value.clearSelection(),c.value.toggleRowSelection(e)}))},x=function(){H.value=!0;var e=JSON.parse(JSON.stringify(f.value));e["sort"]="id",e["order"]="desc",W.value.username&&""!=W.value.username&&(e["username"]="%"+W.value.username+"%"),null===a||void 0===a||a.$http({url:"".concat(i,"/page"),method:"get",params:e}).then((function(e){H.value=!1,d.value=e.data.data.list,z.value=Number(e.data.data.total)}))},V=function(e){var l=(0,t.iH)([]);if(e)l.value=[e];else{if(!C.value.length)return!1;for(var n in C.value)l.value.push(C.value[n].id)}r.T.confirm("是否删除选中".concat(s),"提示",{confirmButtonText:"是",cancelButtonText:"否",type:"warning"}).then((function(){null===a||void 0===a||a.$http({url:"".concat(i,"/delete"),method:"post",data:l.value}).then((function(e){null===a||void 0===a||a.$toolUtil.message("删除成功","success",(function(){x()}))}))}))},$=function(e){C.value=e},z=(0,t.iH)(0),j=(0,t.iH)(["total","prev","pager","next","sizes","jumper"]),M=function(e){f.value.limit=e,x()},N=function(e){f.value.page=e,x()},S=function(){f.value.page=f.value.page-1,x()},q=function(){f.value.page=f.value.page+1,x()},R=function(e,l){return null===a||void 0===a?void 0:a.$toolUtil.isAuth(e,l)},J=function(){f.value.page=1,x()},O=(0,t.iH)(null),D=function(){J()},F=function(){O.value.init()},P=function(){C.value.length&&O.value.init(C.value[0].id,"edit")},T=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:null;e?O.value.init(e,"info"):C.value.length&&O.value.init(C.value[0].id,"info")},B=function(){x()};return B(),function(e,l){var a=(0,n.up)("el-input"),t=(0,n.up)("el-button"),o=(0,n.up)("el-form"),r=(0,n.up)("el-table-column"),i=(0,n.up)("el-table"),s=(0,n.up)("el-pagination"),x=(0,n.Q2)("loading");return(0,n.wg)(),(0,n.iD)("div",null,[(0,n._)("div",p,[(0,n._)("div",m,[(0,n.Wm)(o,{model:W.value,class:"search_form"},{default:(0,n.w5)((function(){return[(0,n._)("div",g,[h,(0,n._)("div",w,[(0,n.Wm)(a,{class:"search_inp",modelValue:W.value.username,"onUpdate:modelValue":l[0]||(l[0]=function(e){return W.value.username=e}),placeholder:"用户名",clearable:""},null,8,["modelValue"])])]),(0,n._)("div",_,[(0,n.Wm)(t,{class:"search_btn",type:"primary",onClick:l[1]||(l[1]=function(e){return J()}),size:"small"},{default:(0,n.w5)((function(){return[(0,n.Uk)("搜索")]})),_:1})])]})),_:1},8,["model"]),b,(0,n._)("div",k,[R("users","新增")?((0,n.wg)(),(0,n.j4)(t,{key:0,type:"success",onClick:F},{default:(0,n.w5)((function(){return[(0,n.Uk)("新增")]})),_:1})):(0,n.kq)("",!0),R("users","查看")?((0,n.wg)(),(0,n.j4)(t,{key:1,type:"info",disabled:1!=C.value.length,onClick:l[2]||(l[2]=function(e){return T(null)})},{default:(0,n.w5)((function(){return[(0,n.Uk)("详情")]})),_:1},8,["disabled"])):(0,n.kq)("",!0),R("users","修改")?((0,n.wg)(),(0,n.j4)(t,{key:2,type:"primary",disabled:1!=C.value.length,onClick:P},{default:(0,n.w5)((function(){return[(0,n.Uk)("修改")]})),_:1},8,["disabled"])):(0,n.kq)("",!0),R("users","删除")?((0,n.wg)(),(0,n.j4)(t,{key:3,type:"danger",disabled:!C.value.length,onClick:l[3]||(l[3]=function(e){return V(null)})},{default:(0,n.w5)((function(){return[(0,n.Uk)("删除")]})),_:1},8,["disabled"])):(0,n.kq)("",!0)])]),y,R("users","查看")?(0,n.wy)(((0,n.wg)(),(0,n.j4)(i,{key:0,border:"",stripe:!1,onSelectionChange:$,ref_key:"table",ref:c,data:d.value,onRowClick:U},{default:(0,n.w5)((function(){return[(0,n.Wm)(r,{resizable:!0,align:"left","header-align":"left",type:"selection",width:"55"}),(0,n.Wm)(r,{label:"序号",width:"70",resizable:!0,sortable:!0,align:"left","header-align":"left"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.$index+1),1)]})),_:1}),(0,n.Wm)(r,{resizable:!0,sortable:!0,align:"left","header-align":"left",prop:"username",label:"用户名"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.row.username),1)]})),_:1}),(0,n.Wm)(r,{resizable:!0,sortable:!0,align:"left","header-align":"left",prop:"role",label:"角色"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.row.role),1)]})),_:1}),(0,n.Wm)(r,{label:"操作",width:"300",resizable:!0,sortable:!0,align:"left","header-align":"left"},{default:(0,n.w5)((function(e){return[R("users","查看")?((0,n.wg)(),(0,n.j4)(t,{key:0,type:"info",onClick:function(l){return T(e.row.id)}},{default:(0,n.w5)((function(){return[(0,n.Uk)("详情")]})),_:2},1032,["onClick"])):(0,n.kq)("",!0)]})),_:1})]})),_:1},8,["data"])),[[x,H.value]]):(0,n.kq)("",!0),(0,n.Wm)(s,{background:"",layout:j.value.join(","),total:z.value,"page-size":f.value.limit,"prev-text":"<","next-text":">","hide-on-single-page":!0,style:{width:"100%",padding:"0",margin:"20px 0 0",whiteSpace:"nowrap",color:"#333",fontWeight:"500"},onSizeChange:M,onCurrentChange:N,onPrevClick:S,onNextClick:q},null,8,["layout","total","page-size"])]),(0,n.Wm)(v,{ref_key:"formRef",ref:O,onFormModelChange:D},null,512)])}}},C=(0,d.Z)(W,[["__scopeId","data-v-074c36de"]]),H=C}}]);
//# sourceMappingURL=525.8b15a32b.js.map