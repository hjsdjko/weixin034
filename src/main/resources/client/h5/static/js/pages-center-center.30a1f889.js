(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-center-center"],{"0fc4":function(e,t,i){"use strict";var n={"uni-transition":i("3200").default,"uni-popup":i("1c89").default},r=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{style:{width:"100%",padding:"0px 0 120rpx",position:"relative",background:"#ff993310",height:"auto"}},[e.user&&e.user.id?i("v-uni-view",{staticClass:"header",class:{status:e.isH5Plus},style:{border:"0px solid #3da742",padding:"48rpx 24rpx 24rpx 48rpx",margin:"0px 0px 20rpx 0px",borderRadius:"0px",background:"none",display:"flex",width:"calc(100% - 0px)",justifyContent:"space-between",height:"auto"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap2("../user-info/user-info",1)}}},["yonghu"==e.tableName?i("v-uni-view",{staticClass:"userinfo",style:{padding:"60rpx 40rpx 60rpx 60rpx",alignItems:"center",flexWrap:"wrap",flexDirection:"column",background:"url(http://clfile.zggen.cn/20240116/7c3fa495ec18456db1985ed752f27670.png) no-repeat center top / 100% 100%",display:"flex",width:"calc(96% - 112rpx)",height:"100%"}},[i("v-uni-view",{staticClass:"info",style:{margin:"20rpx 0 0 0",flex:"1",flexDirection:"column",display:"flex",width:"100%",justifyContent:"center",height:"100%"}},[i("v-uni-view",{style:{width:"100%",lineHeight:"48rpx",fontSize:"28rpx",color:"#333",fontWeight:"600"}},[e._v(e._s(e.user.zhanghao)),e.user.vip&&"是"==e.user.vip?i("v-uni-text",[e._v("(VIP)")]):e._e()],1)],1)],1):e._e(),i("v-uni-view",{staticClass:"setting",style:{border:"0px solid #eeeeee",margin:"24rpx 24rpx 0 0",alignItems:"center",display:"flex",width:"72rpx",justifyContent:"center",height:"100%"}},[i("v-uni-view",{staticClass:"iconfont icon-shezhi1",style:{border:"0px solid #eeeeee",color:"#ff9933",borderRadius:"0px",width:"76rpx",lineHeight:"76rpx",fontSize:"76rpx",fontWeight:"600"}})],1)],1):i("v-uni-view",{staticClass:"header",class:{status:e.isH5Plus},style:{border:"0px solid #3da742",padding:"48rpx 24rpx 24rpx 48rpx",margin:"0px 0px 20rpx 0px",borderRadius:"0px",background:"none",display:"flex",width:"calc(100% - 0px)",justifyContent:"space-between",height:"auto"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap2("../user-info/user-info",1)}}},[i("v-uni-view",{style:{alignItems:"center",textAlign:"center",display:"flex",width:"100%",fontSize:"40rpx",justifyContent:"center",height:"100%"}},[e._v("登录/注册")])],1),i("v-uni-view",{staticClass:"list",style:{padding:"0px 20rpx 40rpx 20rpx",margin:"40rpx 20rpx 120rpx 20rpx",borderRadius:"8rpx",flexWrap:"wrap",background:"none",display:"flex",width:"calc(100% - 40rpx)",justifyContent:"space-between",height:"auto"}},[e._l(e.menuList,(function(t,n){return t.child.length&&"orders"!=t.child[0].tableName?[t.child.length>1?[i("v-uni-view",{staticClass:"li",style:{border:"2rpx solid #ff993350",padding:"0 40rpx 0 0",margin:"0 0 20rpx 0",alignItems:"center",textAlign:"center",display:"flex",transition:"all 0s",borderRadius:"8rpx",flexWrap:"wrap",background:"#fff",width:"100%",position:"relative",height:"80rpx"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.secondClick(n)}}},[e._e(),i("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx 0 20rpx",margin:"0 0 0 0",color:"#333333",display:"inline-block",width:"auto",lineHeight:"48rpx",fontSize:"28rpx"}},[e._v(e._s(t.menu))]),i("v-uni-view",{staticClass:"iconfont icon-gengduo2",style:{color:"#ff9933",top:"32rpx",width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",position:"absolute",right:"20rpx"}})],1),i("uni-transition",{style:{width:"100%",padding:"0px",margin:"0 0 24rpx 0"},attrs:{"mode-class":["fade"],duration:500,show:e.secondIndex==n}},[e._l(t.child,(function(t,n){return["yifahuodingdan"!=t.tableName&&"yituikuandingdan"!=t.tableName&&"yiquxiaodingdan"!=t.tableName&&"weizhifudingdan"!=t.tableName&&"yizhifudingdan"!=t.tableName&&"yiwanchengdingdan"!=t.tableName&&"examquestion"!=t.tableName?i("v-uni-view",{key:n+"_0",staticClass:"li",style:{padding:"0 20rpx 0 20rpx",borderColor:"#eeeeee",margin:"0 0 0 0",alignItems:"center",borderWidth:"0 0 0px 0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap(t.tableName,t.menuJump)}}},[i("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 20rpx 0 20rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#666",flex:"1"}},[e._v(e._s(t.menu))]),e._e()],1):e._e()]}))],2)]:[i("v-uni-view",{staticClass:"li",style:{border:"2rpx solid #ff993350",padding:"0 40rpx 0 0",margin:"0 0 20rpx 0",alignItems:"center",textAlign:"center",display:"flex",transition:"all 0s",borderRadius:"8rpx",flexWrap:"wrap",background:"#fff",width:"100%",position:"relative",height:"80rpx"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap(t.child[0].tableName,t.child[0].menuJump)}}},[e._e(),i("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx 0 20rpx",margin:"0 0 0 0",color:"#333333",display:"inline-block",width:"auto",lineHeight:"48rpx",fontSize:"28rpx"}},[e._v(e._s(t.child[0].menu))]),i("v-uni-view",{staticClass:"iconfont icon-gengduo2",style:{color:"#ff9933",top:"32rpx",width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",position:"absolute",right:"20rpx"}})],1)]]:e._e()})),e.user&&e.user.id?i("v-uni-view",{staticClass:"li",style:{border:"2rpx solid #ff993350",padding:"0 40rpx 0 0",margin:"0 0 20rpx 0",alignItems:"center",textAlign:"center",display:"flex",transition:"all 0s",borderRadius:"8rpx",flexWrap:"wrap",background:"#fff",width:"100%",position:"relative",height:"80rpx"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.passwordShow()}}},[e._e(),i("v-uni-view",{staticClass:"text",style:{padding:"0 20rpx 0 20rpx",margin:"0 0 0 0",color:"#333333",display:"inline-block",width:"auto",lineHeight:"48rpx",fontSize:"28rpx"}},[e._v("修改密码")]),i("v-uni-view",{staticClass:"iconfont icon-gengduo2",style:{color:"#ff9933",top:"32rpx",width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",position:"absolute",right:"20rpx"}})],1):e._e()],2)],1),i("uni-popup",{ref:"passwordPopup",staticClass:"popup-content",attrs:{type:"bottom"}},[i("v-uni-view",{staticClass:"passwordForm"},[i("v-uni-view",{staticClass:"passwordInput"},[i("v-uni-input",{attrs:{type:"password",placeholder:"原密码"},model:{value:e.passwordForm.mima,callback:function(t){e.$set(e.passwordForm,"mima",t)},expression:"passwordForm.mima"}})],1),i("v-uni-view",{staticClass:"passwordInput"},[i("v-uni-input",{attrs:{type:"password",placeholder:"新密码"},model:{value:e.passwordForm.newmima,callback:function(t){e.$set(e.passwordForm,"newmima",t)},expression:"passwordForm.newmima"}})],1),i("v-uni-view",{staticClass:"passwordInput"},[i("v-uni-input",{attrs:{type:"password",placeholder:"确认密码"},model:{value:e.passwordForm.newmima1,callback:function(t){e.$set(e.passwordForm,"newmima1",t)},expression:"passwordForm.newmima1"}})],1),i("v-uni-view",{staticClass:"passwordBtnView"},[i("v-uni-button",{staticClass:"passwordBtn",on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.updatePassword.apply(void 0,arguments)}}},[e._v("更新")])],1)],1)],1)],1)},a=[];i.d(t,"b",(function(){return r})),i.d(t,"c",(function(){return a})),i.d(t,"a",(function(){return n}))},"27ae":function(e,t,i){"use strict";i.r(t);var n=i("55b4"),r=i.n(n);for(var a in n)"default"!==a&&function(e){i.d(t,e,(function(){return n[e]}))}(a);t["default"]=r.a},4024:function(e,t,i){var n=i("24fb");t=n(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-4be84a62]{height:calc(100vh - 94px);box-sizing:border-box}.orderBox[data-v-4be84a62]{border-radius:%?8?%;padding:%?12?% 0;box-shadow:0 0 0 rgba(0,0,0,.3);margin:0 %?20?% 0 %?20?%;background:none;width:calc(100% - %?40?%)}.orderBox .orderTitle[data-v-4be84a62]{padding:%?30?%;margin:0 %?20?% %?20?% %?20?%;color:#fff;background:url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat top/100% 100%;font-weight:500;width:calc(100% - %?40?%);font-size:%?28?%;border-color:#3da742;border-width:0 0 0 0;line-height:%?64?%;border-style:solid;text-align:center}.orderBox .orderList[data-v-4be84a62]{padding:0;margin:0;display:-webkit-box;display:-webkit-flex;display:flex;width:100%;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;-webkit-box-align:center;-webkit-align-items:center;align-items:center;box-sizing:border-box}.orderBox .orderList .orderView[data-v-4be84a62]{margin:%?10?% 2% %?20?% 0;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;display:-webkit-box;display:-webkit-flex;display:flex;width:23%;-webkit-box-align:center;-webkit-align-items:center;align-items:center}.orderBox .orderList .orderView .orderIcons[data-v-4be84a62]{border-radius:%?40?%;background:none;display:-webkit-box;display:-webkit-flex;display:flex;width:%?80?%;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-box-align:center;-webkit-align-items:center;align-items:center;height:%?80?%}.orderBox .orderList .orderView .orderIcons .iconfont[data-v-4be84a62]{border:%?2?% solid rgba(255,153,51,.31);padding:%?8?%;color:#f93;background:none;font-size:%?64?%}.orderBox .orderList .orderView .orderName[data-v-4be84a62]{padding:%?12?% 0 0;width:100%;font-size:%?24?%;text-align:center}.passwordForm[data-v-4be84a62]{width:100%;padding:10px 20px 60px;background:#fff}.passwordForm .passwordInput[data-v-4be84a62]{background:#eee;margin:0 0 10px;padding:0 10px}.passwordForm .passwordInput uni-input[data-v-4be84a62]{height:36px;line-height:36px;font-size:14px}.passwordForm .passwordBtnView[data-v-4be84a62]{width:100%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;padding:10px 0}.passwordForm .passwordBtnView .passwordBtn[data-v-4be84a62]{padding:0 20px;width:auto;height:20px;line-height:20px;font-size:14px;color:#fff;background:#007aff;border:none;border-radius:5px}',""]),e.exports=t},5235:function(e,t,i){var n=i("4024");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var r=i("4f06").default;r("04c6b188",n,!0,{sourceMap:!1,shadowMode:!1})},"55b4":function(e,t,i){"use strict";var n=i("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,i("ac6a"),i("96cf");var r=n(i("3b8d")),a=n(i("2971")),s={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[],secondIndex:-1,orderList:[{name:"全部",icon:"icon-dingdan1"},{name:"未支付",icon:"icon-dingdan2"},{name:"已支付",icon:"icon-dingdan3"},{name:"已完成",icon:"icon-dingdan4"},{name:"已取消",icon:"icon-dingdan5"}],passwordForm:{mima:"",newmima:"",newmima1:""}}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t,i,n,r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.role=uni.getStorageSync("appRole"),t=uni.getStorageSync("nowTable"),e.next=4,this.$api.session(t);case 4:i=e.sent,this.user=i.data,this.tableName=t,n=a.default.list(),e.t0=regeneratorRuntime.keys(n);case 9:if((e.t1=e.t0()).done){e.next=16;break}if(r=e.t1.value,n[r].tableName!=this.tableName){e.next=14;break}return this.menuList=n[r].backMenu,e.abrupt("break",16);case 14:e.next=9;break;case 16:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),onShow:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t,i,n,r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return uni.removeStorageSync("useridTag"),this.role=uni.getStorageSync("appRole"),t=uni.getStorageSync("nowTable"),e.next=5,this.$api.session(t);case 5:i=e.sent,this.user=i.data,this.tableName=t,n=a.default.list(),e.t0=regeneratorRuntime.keys(n);case 10:if((e.t1=e.t0()).done){e.next=17;break}if(r=e.t1.value,n[r].tableName!=this.tableName){e.next=15;break}return this.menuList=n[r].backMenu,e.abrupt("break",17);case 15:e.next=10;break;case 17:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),methods:{getSession:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t,i;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:i=e.sent,this.user=i.data,this.$forceUpdate();case 6:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),orderClick:function(e){uni.navigateTo({url:"../shop-order/shop-order?status="+e,fail:function(){uni.switchTab({url:"../shop-order/shop-order?status="+e})}})},secondClick:function(e){if(this.secondIndex==e)return this.secondIndex=-1,!1;this.secondIndex=e},onPageTap:function(e,t){return uni.setStorageSync("useridTag",1),"exampaper"==e?(this.onPageTap2("../exampaperlist/list"),!1):"examrecord"==e&&"22"==t?(this.onPageTap2("../examfailrecord/list",2),!1):"storeup"==e?(this.onPageTap2("../storeup/list?userid="+this.user.id+"&menuJump="+t,1),!1):void this.onPageTap2("../".concat(e,"/list"),2)},onPageTap2:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:1;if(!this.user)return uni.navigateTo({url:"/pages/login/login"}),!1;var i=this;uni.navigateTo({url:e+(2==t?"?userid=".concat(i.user.id):""),fail:function(){uni.switchTab({url:e+(2==t?"?userid=".concat(i.user.id):"")})}})},passwordShow:function(){this.passwordForm={mima:"",newmima:"",newmima1:""},this.$forceUpdate(),this.$refs.passwordPopup.open()},updatePassword:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t,i;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(""!=this.passwordForm.mima){e.next=3;break}return this.$utils.msg("原密码不能为空"),e.abrupt("return",!1);case 3:if(""!=this.passwordForm.newmima){e.next=6;break}return this.$utils.msg("新密码不能为空"),e.abrupt("return",!1);case 6:if(""!=this.passwordForm.newmima1){e.next=9;break}return this.$utils.msg("确认密码不能为空"),e.abrupt("return",!1);case 9:if(t="","yonghu"==this.tableName&&(t=this.user.mima),i=this.passwordForm.mima,t==i){e.next=15;break}return this.$utils.msg("原密码不正确"),e.abrupt("return",!1);case 15:if(this.passwordForm.newmima==this.passwordForm.newmima1){e.next=18;break}return this.$utils.msg("两次密码不一致"),e.abrupt("return",!1);case 18:return this.tableName,"yonghu"==this.tableName&&(this.user.mima=this.passwordForm.newmima),e.next=22,this.$api.update(this.tableName,this.user);case 22:this.$utils.msg("修改密码成功,下次登录系统生效"),this.$refs.passwordPopup.close(),this.getSession();case 25:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()}};t.default=s},c6f5:function(e,t,i){"use strict";var n=i("5235"),r=i.n(n);r.a},d2c0:function(e,t,i){"use strict";i.r(t);var n=i("0fc4"),r=i("27ae");for(var a in r)"default"!==a&&function(e){i.d(t,e,(function(){return r[e]}))}(a);i("c6f5");var s,o=i("f0c5"),d=Object(o["a"])(r["default"],n["b"],n["c"],!1,null,"4be84a62",null,!1,n["a"],s);t["default"]=d.exports}}]);