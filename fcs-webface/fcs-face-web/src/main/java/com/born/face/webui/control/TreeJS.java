/*
 * Created on 2003-12-5
 * author: He Kun
 */
package com.born.face.webui.control;
/**
 * <Title>TreeJS<br>
 * <Descripiton>TreeJS<br>
 * <Company>bornsoft
 * @author He Kun
 *2003-12-5 14:22:09
 */
/**
 * 
 * <Title>TreeJS<br>
 * <Descripiton>���Tree����Ŀͻ��˽ű�<br>
 * <Company>bornsoft
 * @author He Kun
 *2003-12-12 13:38:04
 */
public class TreeJS
{
	/**
	 *���Tree����Ŀͻ��˽ű�
	 *<br>
	 *<br><b>�ͻ�����Ҫ���Ժͷ���</b>
	 *<br> Tree_getTree(treeId) ���Tree��id����һ��Tree����
	 *<br>
	 *<br><b>�ͻ���tree�����Ҫ���Ժͷ���</b>
	 *<br> 1. ���ԣ� id  ���ػ�����Tree�����id
	 *<br> 2. ������ getSelectedNode() ���ص�ǰ������ѡ�еĽڵ�(����Ϊ��tree_item)
	 *<br><b>�ͻ���tree_item��(��TreeNode������ͬ)����Ҫ���Ժͷ���</b>
	 *<br> 1. ���ԣ�id �ڵ�id
	 *<br> 2. ���ԣ�text �ڵ�text
	 *<br> 3. ���ԣ�url �ڵ���ʱҪ�򿪵�url
	 *<br> 4. ���ԣ�target �ڵ���ʱ�򿪵�url��λ��
	 *<br> 5. ���ԣ�checked �ڵ��check״̬����showCheckBoxΪfalseʱ��Ч
	 *<br> 6. ���ԣ�o_root �ڵ����ڵ�tree����(tree����)
	 *<br> 7. ���ԣ�o_parent �ڵ�ĸ��ڵ����(tree_item����)
	 *<br> 8. ���ԣ�b_opened �ڵ��Ƿ�չ��
	 * @return	�ű��ļ���λ������
	 */
	public static String getTreeJS()
	{
		JSTool jstool = new JSTool("TreeJS.js");
		if(!jstool.util.isUpdateJsEveryTime())
		 {
			 return jstool.getComponentJS() ;//+ HashMapJS.getHashMapJS();
		 }
		StringBuffer js = new StringBuffer();
		js.append("// Title: Tigra Tree\r\n");
		js.append("// Description: See the demo at url\r\n");
		js.append("// URL: http://www.softcomplex.com/products/tigra_menu_tree/\r\n");
		js.append("// Version: 1.1\r\n");
		js.append("// Date: 11-12-2002 (mm-dd-yyyy)\r\n");
		js.append("// Contact: feedback@softcomplex.com (specify product title in the subject)\r\n");
		js.append("// Notes: This script is free. Visit official site for further details.\r\n");
		js.append("\r\n");
		js.append("\r\n");
		js.append("\r\n");
		js.append("var trees;\r\n");
		js.append("if(trees==null) trees = [];    \r\n");
		js.append("\r\n");
		js.append("function Tree_getTreeByIndex(index)\r\n");
		js.append("{\r\n");
		js.append("	return trees[index];\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function Tree_getTree(id)\r\n");
		js.append("{\r\n");
		js.append("	for(var i=0;i<trees.length;i++)\r\n");
		js.append("	{\r\n");
		js.append("		if(trees[i].id===id)\r\n");
		js.append("			return trees[i];\r\n");
		js.append("	}\r\n");
		js.append("	return null;\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("\r\n");
		js.append("function tree (id,a_items, a_template,treePanel,cookie_name) \r\n");
		js.append("{\r\n");
		js.append("\r\n");
		js.append("	this.id=id;\r\n");
		js.append("	this.a_tpl      = a_template;\r\n");
		js.append("	this.a_config   = a_items;\r\n");
		js.append("	this.o_root     = this;\r\n");
		js.append("	this.a_index    = [];\r\n");
		js.append("	this.o_selected = null;\r\n");
		js.append("	this.n_depth    = -1;\r\n");
		js.append("	this.a_children = [];\r\n");
		js.append("	this.cookie_name=cookie_name;\r\n");
		js.append("	//comment,below fields are added by hekun,bornsoft/////////////////////////////\r\n");
		js.append("	this.panel=treePanel;	\r\n");
		js.append("	this.cssClass=this.panel.getAttribute(\"treeCss\");\r\n");
		js.append("	this.showImages=this.panel.getAttribute(\"showImages\");\r\n");
		js.append("	this.showCheckBox=false;\r\n");
		js.append("	if(this.panel.getAttribute(\"showCheckBox\")===\"true\" ||this.panel.getAttribute(\"showChekcBox\")===true)\r\n");
		js.append("		this.showCheckBox=true; \r\n");
		js.append("	else\r\n");
		js.append("		this.showCheckBox=false;\r\n");
		js.append("	//qch\r\n");
		js.append("	this.isShowUnaidedImage=false;\r\n");
		js.append("	if(this.panel.getAttribute(\"isShowUnaidedImage\")===\"true\" ||this.panel.getAttribute(\"isShowUnaidedImage\")===true)\r\n");
		js.append("		this.isShowUnaidedImage=true; \r\n");
		js.append("	else\r\n");
		js.append("		this.isShowUnaidedImage=false;\r\n");
		js.append("	this.fieldCount=parseInt(this.panel.getAttribute(\"fieldCount\"));	\r\n");
		js.append("	\r\n");
		js.append("	if(this.panel.getAttribute(\"isSelectedParentNode\")===\"true\" ||this.panel.getAttribute(\"isSelectedParentNode\")===true)\r\n");
		js.append("		this.isSelectedParentNode=true; \r\n");
		js.append("	else\r\n");
		js.append("		this.isSelectedParentNode=false;\r\n");
		js.append("	this.fieldCount=parseInt(this.panel.getAttribute(\"fieldCount\"));	\r\n");
		js.append("	\r\n");
		js.append("	//qch\r\n");
		js.append("	//if(this.fieldCount==6) this.fieldCount=5;\r\n");
		js.append("	this.idField=this.panel.getAttribute(\"idField\");\r\n");
		js.append("	this.textField=this.panel.getAttribute(\"textField\");\r\n");
		js.append("	this.parentField=this.panel.getAttribute(\"parentField\");\r\n");
		js.append("	this.urlField=this.panel.getAttribute(\"urlField\");\r\n");
		js.append("	this.targetField=this.panel.getAttribute(\"targetField\");\r\n");
		js.append("	this.checkField=this.panel.getAttribute(\"checkField\");\r\n");
		js.append("	this.treeHidden=document.getElementById(this.id+\"_hidden\");	\r\n");
		js.append("	//end comment//////////////////////////////	\r\n");
		js.append("	this.selectedNode=null;	\r\n");
		js.append("	var o_icone = new Image(), o_iconl = new Image();\r\n");
		js.append("\r\n");
		js.append("	//init a tree\r\n");
		js.append("	o_icone.src = a_template['icon_e'];\r\n");
		js.append("	o_iconl.src = a_template['icon_l'];\r\n");
		js.append("	a_template['im_e'] = o_icone;\r\n");
		js.append("	a_template['im_l'] = o_iconl;\r\n");
		js.append("	for (var i = 0; i < 64; i++)\r\n");
		js.append("		if (a_template['icon_' + i]) {\r\n");
		js.append("			var o_icon = new Image();\r\n");
		js.append("			a_template['im_' + i] = o_icon;\r\n");
		js.append("			o_icon.src = a_template['icon_' + i];\r\n");
		js.append("		}\r\n");
		js.append("	\r\n");
		js.append("	for (var i = 0; i < a_items.length; i++)\r\n");
		js.append("		var rootNode=new tree_item(this, i);\r\n");
		js.append("\r\n");
		js.append("	this.n_id = trees.length;\r\n");
		js.append("	trees[this.n_id] = this;\r\n");
		js.append("	//end init a tree\r\n");
		js.append("\r\n");
		js.append("	//methods definition of tree\r\n");
		js.append("	this.toggle = function (n_id) \r\n");
		js.append("		{	\r\n");
		js.append("			var o_item = this.a_index[n_id]; 			\r\n");
		js.append("			o_item.open(o_item.b_opened); \r\n");
		js.append("		};\r\n");
		js.append("	this.select =onSelect; \r\n");
		js.append("	this.mout   = function (n_id) { if(this.a_index[n_id]==null) return; else this.a_index[n_id].upstatus(true) };\r\n");
		js.append("	this.mover  = function (n_id) { if(this.a_index[n_id]==null) return; else this.a_index[n_id].upstatus() };\r\n");
		js.append("	this.show=show;\r\n");
		js.append("	this.check=onCheck;\r\n");
		js.append("	this.handleKeyDown=handleKeyDown;\r\n");
		js.append("	//һ�·�����hekun��ӣ�	\r\n");
		js.append("	this.getSelectedNode=function () {	return this.selectedNode;	};\r\n");
		js.append("	//event\r\n");
		js.append("	this.setOnNodeClick=setOnNodeClick;\r\n");
		js.append("	//method to op root node(s)\r\n");
		js.append("	this.getChild=treeGetChild;\r\n");
		js.append("	\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("//tree method :show\r\n");
		js.append("	function show()\r\n");
		js.append("	{\r\n");
		js.append("		for (var i = 0; i < this.a_children.length; i++) \r\n");
		js.append("		{\r\n");
		js.append("			document.write(this.a_children[i].init());\r\n");
		js.append("			this.a_children[i].open(true,true);			\r\n");
		js.append("		}\r\n");
		js.append("		var a_b_opened = [1,];\r\n");
		js.append("		try{\r\n");
		js.append("		    a_b_opened = eval(getCookie(this.cookie_name));\r\n");
		js.append("\r\n");
		js.append("		}catch(e){\r\n");
		js.append("		    document.cookie = this.cookie_name + \"=[1,]\";\r\n");
		js.append("		    a_b_opened = [1,];\r\n");
		js.append("		}\r\n");
		js.append("		if(a_b_opened == null){\r\n");
		js.append("		  a_b_opened = [1,];	\r\n");
		js.append("		}\r\n");
		js.append("		if(a_b_opened && a_b_opened.length){\r\n");
		js.append("	        for (var i = 0; i < this.a_index.length; i++) {\r\n");
		js.append("\r\n");
		js.append("	            	this.a_index[i].open(!a_b_opened[i],false);\r\n");
		js.append("	        }\r\n");
		js.append("		}\r\n");
		js.append("		\r\n");
		js.append("\r\n");
		js.append("	}\r\n");
		js.append("\r\n");
		js.append("	function treeGetChild(id)\r\n");
		js.append("	{		\r\n");
		js.append("		for(var i=0;i<this.a_children.length;i++)\r\n");
		js.append("		{	\r\n");
		js.append("			if(this.a_children[i]!=null && this.a_children[i].id===id)\r\n");
		js.append("				return this.a_children[i];\r\n");
		js.append("		}\r\n");
		js.append("		return null;\r\n");
		js.append("	}\r\n");
		js.append("\r\n");
		js.append("	//����ڵ�ʱ��ִ���û��Զ����¼�,�Զ����¼���Ҫ�ڴ���չ\r\n");
		js.append("	function onSelect(n_id)\r\n");
		js.append("	{	\r\n");
		js.append("		var node=this.a_index[n_id].select(); \r\n");
		js.append("		if(node==null) return; \r\n");
		js.append("		//����ڵ�ʱ��ִ���û��Զ����¼�,�Զ����¼���Ҫ�ڴ���չ\r\n");
		js.append("		var clickEventReturn=true;\r\n");
		js.append("		if(this.panel.getAttribute(\"onNodeClick\")!=null)\r\n");
		js.append("			clickEventReturn=eval(this.panel.getAttribute('onNodeClick'));\r\n");
		js.append("		//���ڵ�������url����ת��url�����û�onNodeClick�¼���������п� return false ��ֹת��url\r\n");
		js.append("		if(clickEventReturn!=false && node.url!=null && node.url!=\"\")\r\n");
		js.append("		{	\r\n");
		js.append("			if( node.target!=null && node.target!=\"\")\r\n");
		js.append("			{\r\n");
		js.append("				window.open(node.url,node.target);\r\n");
		js.append("			}\r\n");
		js.append("			else\r\n");
		js.append("				window.location.href=node.url;			\r\n");
		js.append("		}\r\n");
		js.append("		\r\n");
		js.append("	}\r\n");
		js.append("	//handle node check event\r\n");
		js.append("	function onCheck(n_id)\r\n");
		js.append("	{\r\n");
		js.append("		\r\n");
		js.append("		var node=this.a_index[n_id];\r\n");
		js.append("		if(node!=null)\r\n");
		js.append("		{			\r\n");
		js.append("			var checkBox=document.getElementById(\"ck_\"+node.o_root.n_id + \"_\" + node.n_id );\r\n");
		js.append("			if(checkBox!=null)\r\n");
		js.append("				node.check(checkBox.checked);\r\n");
		js.append("		}\r\n");
		js.append("		this.o_root.select(n_id);   \r\n");
		js.append("	}\r\n");
		js.append("\r\n");
		js.append("\r\n");
		js.append("	function setOnNodeClick(eventExpr)\r\n");
		js.append("	{\r\n");
		js.append("		if(this.panel.getAttribute(\"onNodeClick\")!=null)\r\n");
		js.append("		{			\r\n");
		js.append("			var ev=this.panel.getAttribute('onNodeClick');\r\n");
		js.append("			ev+=\";\"+eventExpr+\";\";\r\n");
		js.append("			this.panel.setAttribute('onNodeClick',ev);\r\n");
		js.append("		}\r\n");
		js.append("	}\r\n");
		js.append("\r\n");
		js.append("	function handleKeyDown(n_id,event)\r\n");
		js.append("	{\r\n");
		js.append("		var o_item = this.a_index[n_id];		\r\n");
		js.append("		\r\n");
		js.append("		switch(event.keyCode)\r\n");
		js.append("		{\r\n");
		js.append("			case 37://��;				\r\n");
		js.append("				if(o_item.a_children.length!=0 && o_item.b_opened===true)\r\n");
		js.append("					trees[o_item.o_root.n_id].toggle(n_id);	\r\n");
		js.append("				else if(o_item.o_parent!=null && o_item.o_parent.b_opened===true)\r\n");
		js.append("					trees[o_item.o_root.n_id].toggle(o_item.o_parent.n_id);	\r\n");
		js.append("				return false;\r\n");
		js.append("				break;\r\n");
		js.append("			case 38://��\r\n");
		js.append("				var prevNode=o_item.getVisblePrevNode(n_id);								\r\n");
		js.append("				if(prevNode!=null) trees[o_item.o_root.n_id].select(prevNode.n_id);	\r\n");
		js.append("				return false;\r\n");
		js.append("				break;\r\n");
		js.append("			case 39://��\r\n");
		js.append("				if(o_item.a_children.length!=0 && o_item.b_opened===false)\r\n");
		js.append("					trees[o_item.o_root.n_id].toggle(n_id);						\r\n");
		js.append("				if(o_item.a_children.length!=0 && o_item.b_opened===true)\r\n");
		js.append("					trees[o_item.o_root.n_id].select(n_id+1);	\r\n");
		js.append("				return false;\r\n");
		js.append("				break;\r\n");
		js.append("			case 40://��\r\n");
		js.append("				var nextNode=o_item.getVisbleNextNode(n_id);\r\n");
		js.append("				if(nextNode!=null) trees[o_item.o_root.n_id].select(nextNode.n_id);\r\n");
		js.append("				return false;\r\n");
		js.append("				break;\r\n");
		js.append("			case 32: //�ո�ѡ��				\r\n");
		js.append("				if(this.showCheckBox==true)\r\n");
		js.append("				{				\r\n");
		js.append("					var ck=document.getElementById(\"ck_\"+o_item.o_root.n_id + \"_\" + o_item.n_id );\r\n");
		js.append("					if(ck!=null) ck.click();\r\n");
		js.append("					//if(o_item.o_root!=null) o_item.o_root.check(o_item.n_id);				\r\n");
		js.append("				}\r\n");
		js.append("		}\r\n");
		js.append("\r\n");
		js.append("	}\r\n");
		js.append("\r\n");
		js.append("	function putInHidden(tree)\r\n");
		js.append("	{			\r\n");
		js.append("		//*****************\r\n");
		js.append("		//if(tree.showCheckBox==true && tree.treeHidden!=null)\r\n");
		js.append("		tree.treeHidden.value=\"\";\r\n");
		js.append("		for(var i=0;i<tree.a_config.length;i++)\r\n");
		js.append("		{			\r\n");
		js.append("			putArray(tree,tree.a_config[i],\"\");\r\n");
		js.append("		}\r\n");
		js.append("	}\r\n");
		js.append("\r\n");
		js.append("	function putArray(tree,a_config,parentId)\r\n");
		js.append("	{		\r\n");
		js.append("		var str=\"\";	\r\n");
		js.append("		if(tree.idField==null) tree.idField=\"id\";\r\n");
		js.append("		if(tree.textField==null) tree.textField=\"text\";\r\n");
		js.append("		if(tree.parentField==null) tree.parentField=\"parent\";\r\n");
		js.append("		if(tree.urlField==null) tree.urlField=\"url\";\r\n");
		js.append("		if(tree.targetField==null) tree.targetField=\"target\";\r\n");
		js.append("		if(tree.checkField==null) tree.checkField=\"check\";\r\n");
		js.append("		str+=tree.idField+\"=\"+a_config[1];\r\n");
		js.append("		var nodeId=a_config[1];\r\n");
		js.append("		str+=\",\"+tree.textField+\"=\"+a_config[0];\r\n");
		js.append("		str+=\",\"+tree.urlField+\"=\"+a_config[2];\r\n");
		js.append("		str+=\",\"+tree.targetField+\"=\"+a_config[3];			\r\n");
		js.append("				\r\n");
		js.append("		if(tree.fieldCount>=5)\r\n");
		js.append("			str+=\",\"+tree.checkField+\"=\"+a_config[4];		\r\n");
		js.append("		str+=\",\"+tree.parentField+\"=\"+parentId;\r\n");
		js.append("		//////////////////				\r\n");
		js.append("		\r\n");
		js.append("		if(tree.treeHidden!=null)				\r\n");
		js.append("			HashtableManager_Add(a_config[1],str,tree.treeHidden);		\r\n");
		js.append("		for(var i=tree.fieldCount;i<a_config.length;i++)\r\n");
		js.append("		{				\r\n");
		js.append("			if(a_config[i]!=null && a_config[i].length>0)\r\n");
		js.append("				putArray(tree,a_config[i],nodeId);\r\n");
		js.append("		}\r\n");
		js.append("	}\r\n");
		js.append("\r\n");
		js.append("//treeItem��\r\n");
		js.append("function tree_item (o_parent, n_order) \r\n");
		js.append("{\r\n");
		js.append("	this.n_depth  = o_parent.n_depth + 1;	\r\n");
		js.append("	this.o_root    = o_parent.o_root;\r\n");
		js.append("	this.o_parent  = o_parent;\r\n");
		js.append("	this.n_order   = n_order;\r\n");
		js.append("	this.n_fieldCount=this.o_root.fieldCount;	//ÿ���ڵ���4�������:text,id,url,target\r\n");
		js.append("	\r\n");
		js.append("	this.a_config = o_parent.a_config[n_order + (this.n_depth ? this.n_fieldCount : 0)];	\r\n");
		js.append("\r\n");
		js.append("	if (!this.a_config) return;\r\n");
		js.append("	this.text=this.a_config[0];	\r\n");
		js.append("	this.id=this.a_config[1];\r\n");
		js.append("	this.url=this.a_config[2];\r\n");
		js.append("	this.target=this.a_config[3];\r\n");
		js.append("	//qch\r\n");
		js.append("	this.imageName=this.a_config[5];\r\n");
		js.append("	\r\n");
		js.append("	this.checked=false;	\r\n");
		js.append("	this.b_opened  = !this.n_depth;\r\n");
		js.append("\r\n");
		js.append("	this.n_id = this.o_root.a_index.length;\r\n");
		js.append("	this.o_root.a_index[this.n_id] = this;\r\n");
		js.append("	o_parent.a_children[n_order] = this;\r\n");
		js.append("\r\n");
		js.append("	this.a_children = [];\r\n");
		js.append("	for (var i = 0; i < this.a_config.length - 2; i++)\r\n");
		js.append("		new tree_item(this, i);\r\n");
		js.append("\r\n");
		js.append("	this.get_icon = item_get_icon;\r\n");
		js.append("	this.open     = item_open;\r\n");
		js.append("	this.select   = item_select;\r\n");
		js.append("	this.init     = item_init;\r\n");
		js.append("	this.upstatus = item_upstatus;\r\n");
		js.append("	this.is_last  = function () { return this.n_order == this.o_parent.a_children.length - 1 };\r\n");
		js.append("	this.check=item_check;\r\n");
		js.append("\r\n");
		js.append("	if(this.n_fieldCount>=5)\r\n");
		js.append("	{	//ѡ��״̬Ĭ��Ϊ false\r\n");
		js.append("		var v=(this.a_config[4]==true) || (this.a_config[4]==\"true\");		\r\n");
		js.append("		this.checked=v;\r\n");
		js.append("	}\r\n");
		js.append("	\r\n");
		js.append("	this.addNode=item_addNode;\r\n");
		js.append("	this.getChild=item_getChild;\r\n");
		js.append("	this.removeNode=item_removeNode;	\r\n");
		js.append("\r\n");
		js.append("	this.getVisblePrevNode=item_getVisblePrevNode;\r\n");
		js.append("	this.getVisbleNextNode=item_getVisbleNextNode;	\r\n");
		js.append("	this.autoCheck=item_auto_check;	\r\n");		
		js.append("}\r\n");
		js.append("\r\n");
		js.append("\r\n");
		js.append("//treeItem�ķ���\r\n");
		js.append("function item_open (b_close,isNotWriteCookie) {\r\n");
		js.append("	var o_idiv = document.getElementById('i_div' + this.o_root.n_id + '_' + this.n_id);\r\n");
		js.append("	if (!o_idiv) return;\r\n");
		js.append("	\r\n");
		js.append("	if (!o_idiv.innerHTML) {\r\n");
		js.append("		var a_children = [];\r\n");
		js.append("		for (var i = 0; i < this.a_children.length; i++)\r\n");
		js.append("			a_children[i]= this.a_children[i].init();\r\n");
		js.append("		o_idiv.innerHTML = a_children.join('');\r\n");
		js.append("	}\r\n");
		js.append("	//����ֽڵ��н��㣬��������ǰ�ڵ�ʱ������ص���ǰ�ڵ�\r\n");
		js.append("	if(this.o_root.selectedNode!=null)\r\n");
		js.append("		if(this.o_root.selectedNode.o_parent.id===this.id)\r\n");
		js.append("		trees[this.o_root.n_id].select(this.n_id);\r\n");
		js.append("	o_idiv.style.display = (b_close ? 'none' : 'block');\r\n");
		js.append("	\r\n");
		js.append("	this.b_opened = !b_close;\r\n");
		js.append("	var o_jicon = document.images['j_img' + this.o_root.n_id + '_' + this.n_id],\r\n");
		js.append("		o_iicon = document.images['i_img' + this.o_root.n_id + '_' + this.n_id];\r\n");
		js.append("	if (o_jicon) o_jicon.src = this.get_icon(true);\r\n");
		js.append("	if (o_iicon) o_iicon.src = this.get_icon();\r\n");
		js.append("\r\n");
		js.append("	this.upstatus();\r\n");
		js.append("	if(!isNotWriteCookie&&this.o_root.cookie_name!=\"\")\r\n");
		js.append("	{\r\n");
		js.append("		writeCookie(this.o_root);	\r\n");
		js.append("	}\r\n");
		js.append("	\r\n");
		js.append("}\r\n");
		js.append("function writeCookie(o_tree){  \r\n");
		js.append("\r\n");
		js.append("    var cookie_val = \"[\";\r\n");
		js.append("    var o_item = null;\r\n");
		js.append("    for(var i=0;i<o_tree.a_index.length;i++){\r\n");
		js.append("        o_item = o_tree.a_index[i];\r\n");
		js.append("        if(o_item.b_opened){\r\n");
		js.append("            cookie_val += \"1,\";\r\n");
		js.append("        }else{\r\n");
		js.append("            cookie_val += \"0,\";\r\n");
		js.append("        }\r\n");
		js.append("    }\r\n");
		js.append("    cookie_val += \"]\";\r\n");
		js.append("    document.cookie = o_tree.cookie_name + \"=\" + escape(cookie_val);\r\n");
		js.append("}\r\n");
		js.append("function getCookie(cookie_name){\r\n");
		js.append("	if(cookie_name==\"\")\r\n");
		js.append("	{\r\n");
		js.append("		return \"[1,]\";\r\n");
		js.append("	} \r\n");
		js.append("    var allcookies = document.cookie;\r\n");
		js.append("    var cookie_pos = allcookies.indexOf(cookie_name);\r\n");
		js.append("    // ����ҵ�������ʹ��cookie���ڣ�\r\n");
		js.append("    // ��֮����˵�������ڡ�\r\n");
		js.append("    if (cookie_pos != -1){\r\n");
		js.append("        // ��cookie_pos����ֵ�Ŀ�ʼ��ֻҪ��ֵ��1���ɡ�\r\n");
		js.append("        cookie_pos += cookie_name.length + 1;\r\n");
		js.append("        var cookie_end = allcookies.indexOf(\";\", cookie_pos);\r\n");
		js.append("        if (cookie_end == -1){\r\n");
		js.append("            cookie_end = allcookies.length;\r\n");
		js.append("        }\r\n");
		js.append("        var value = unescape(allcookies.substring(cookie_pos, cookie_end));\r\n");
		js.append("    }\r\n");
		js.append("    return value;\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function item_select (b_deselect) {\r\n");
		js.append("	if (!b_deselect) {\r\n");
		js.append("		var o_olditem = this.o_root.o_selected;\r\n");
		js.append("		this.o_root.o_selected = this;\r\n");
		js.append("		if (o_olditem) o_olditem.select(true);\r\n");
		js.append("	}\r\n");
		js.append("	var o_iicon = document.images['i_img' + this.o_root.n_id + '_' + this.n_id];\r\n");
		js.append("   	if (o_iicon) o_iicon.src = this.get_icon();\r\n");
		js.append("	///һ�´������˲��ָĶ�///\r\n");
		js.append("	\r\n");
		js.append("	var selected=document.getElementById('i_txt' + this.o_root.n_id + '_' + this.n_id);\r\n");
		js.append("	if(selected==null) return;\r\n");
		js.append("	selected.style.color = b_deselect ? '' : 'white';        \r\n");
		js.append("	selected.style.background = b_deselect ? '' : '#0066CC';	     //ѡ�����Ӧ�����޸�	\r\n");
		js.append("	selected.focus();\r\n");
		js.append("	//b_deselectû����ʱ��Ϊ��ȷ�ĵ�ǰѡ����\r\n");
		js.append("	if(!b_deselect) \r\n");
		js.append("	{	\r\n");
		js.append("		Tree_getTreeByIndex(this.o_root.n_id).selectedNode=this;		\r\n");
		js.append("		this.upstatus();\r\n");
		js.append("		return Tree_getTreeByIndex(this.o_root.n_id).selectedNode;\r\n");
		js.append("	}	\r\n");
		js.append("	this.upstatus();\r\n");
		js.append("	//get selected node attr\r\n");
		js.append("    //return Boolean(this.a_config[1]);\r\n");
		js.append("	\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function item_upstatus (b_clear) {\r\n");
		js.append("	window.setTimeout('window.status=\"' + (b_clear ? '' : this.a_config[0] + (this.a_config[2] ? ' ('+ this.a_config[2] + ')' : '')) + '\"', 10);\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function item_init () {\r\n");
		js.append("	var a_offset = [],\r\n");
		js.append("		o_current_item = this.o_parent;\r\n");
		js.append("	for (var i = this.n_depth; i > 1; i--) {\r\n");
		js.append("		a_offset[i] = '<img src=\"' + this.o_root.a_tpl[o_current_item.is_last() ? 'icon_e' : 'icon_l'] + '\" border=\"0\" align=\"absbottom\">';\r\n");
		js.append("		o_current_item = o_current_item.o_parent;\r\n");
		js.append("	}\r\n");
		js.append("	\r\n");
		js.append("\r\n");
		js.append("	//if(this.checked==true)\r\n");
		js.append("	//this.check(this.checked);\r\n");
		js.append("/*	if(this.o_parent!=null  && this.o_parent.checked==true)\r\n");
		js.append("	{\r\n");
		js.append("		this.check(this.o_parent.checked);			\r\n");
		js.append("	}\r\n");
		js.append("*/	\r\n");
		js.append("   \r\n");
		js.append("	var checkedHtml=\"\";	\r\n");
		js.append("	if(this.checked==true) checkedHtml=\"checked\";\r\n");
		js.append("\r\n");
		js.append("	var itemHtml='<div id=\"'+this.o_parent.n_id + \"_\" +this.id+'\"><table id=\"'+this.id+'_table \"cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td nowrap class=\"treeTD\">' + (this.n_depth ? a_offset.join('') + (this.a_children.length\r\n");
		js.append("		? '<img onClick=\"javascript: trees[' + this.o_root.n_id + '].toggle(' + this.n_id + ')\" onmouseover=\"trees[' + this.o_root.n_id + '].mover(' + this.n_id + ')\" onmouseout=\"trees[' + this.o_root.n_id + '].mout(' + this.n_id + ')\" src=\"' + this.get_icon(true) + '\" border=\"0\" align=\"absbottom\" name=\"j_img' + this.o_root.n_id + '_' + this.n_id + '\">'\r\n");
		js.append("		: '<img src=\"' + this.get_icon(true) + '\" border=\"0\" align=\"absbottom\">') : '') ;\r\n");
		js.append("	\r\n");
		js.append("	// itemHtml+='<span >';            \r\n");
		js.append("	if(this.o_root.showCheckBox==\"true\" ||this.o_root.showCheckBox==true)//�Ƿ��checkBox,Ĭ�ϲ���\r\n");
		js.append("	itemHtml+='<input id=\"ck_'+this.o_root.n_id + '_' + this.n_id +'\" type=\"checkBox\" '+checkedHtml+' align=\"absbottom\" class=\"treeCheckBox\" onClick=\"trees[' + this.o_root.n_id + '].check(' + this.n_id + ');\" >&nbsp;';\r\n");
		js.append("\r\n");
		js.append("	itemHtml+='<a href=\"javascript: trees[' + this.o_root.n_id + '].select(' + this.n_id + ')\" ondblclick=\"trees[' + this.o_root.n_id + '].toggle(' + this.n_id + ')\"   onKeyDown=\"return trees[' + this.o_root.n_id + '].handleKeyDown(' + this.n_id + ',event);\" onmouseover=\"trees[' + this.o_root.n_id + '].mover(' + this.n_id + ')\" onmouseout=\"trees[' + this.o_root.n_id + '].mout(' + this.n_id + ')\" class=\"'+this.o_root.cssClass+'\" id=\"i_txt' + this.o_root.n_id + '_' + this.n_id + '\">';\r\n");
		js.append("	if(!(this.o_root.showImages==\"false\" ||this.o_root.showImages==false))//�Ƿ�ӽڵ�ͼ�꣬Ĭ�ϼ�\r\n");
		js.append("		itemHtml+='<img src=\"' + this.get_icon() + '\" border=\"0\" align=\"absbottom\" name=\"i_img' + this.o_root.n_id + '_' + this.n_id + '\" class=\"'+this.o_root.cssClass+'\">';\r\n");
		js.append("	\r\n");
		js.append("	itemHtml+= this.a_config[0] + '</a>';     \r\n");
		js.append("	itemHtml+='</td></tr></table>' + (this.a_children.length ? '<div id=\"i_div' + this.o_root.n_id + '_' + this.n_id + '\" style=\"display:none\"></div>' : '');\r\n");
		js.append("	itemHtml+=\"</div>\";\r\n");
		js.append("	return itemHtml;\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function item_get_icon (b_junction) {\r\n");
		js.append("	var iconSrc='icon_' + ((this.n_depth ? 0 : 32) + (this.a_children.length ? 16 : 0)  + (!b_junction && this.o_root.o_selected == this ? 4 : 0) + (b_junction ? 2 : 0) + (this.a_children.length && this.b_opened ? 8 : 0)+ (b_junction && this.is_last() ? 1 : 0));\r\n");
		js.append("\r\n");
		js.append("	if(iconSrc==='icon_32' ||iconSrc==='icon_36') iconSrc='icon_48';\r\n");
		js.append("	var UnaidedImage=true;	\r\n");
		js.append("	if(iconSrc==\"icon_2\"||iconSrc==\"icon_3\"||iconSrc==\"icon_18\"||iconSrc==\"icon_19\"||iconSrc==\"icon_26\"||iconSrc==\"icon_27\")\r\n");
		js.append("	{\r\n");
		js.append("		UnaidedImage=false;\r\n");
		js.append("	}\r\n");
		js.append("	var icon=this.o_root.a_tpl[iconSrc];\r\n");
		js.append("	if((this.imageName=='null'||!this.o_root.isShowUnaidedImage||UnaidedImage==false)){\r\n");
		js.append("		return icon\r\n");
		js.append("	}\r\n");
		js.append("	else\r\n");
		js.append("	{\r\n");
		js.append("		icon=item_get_itemIcon(this)	\r\n");
		js.append("	}	\r\n");
		js.append("	return icon;\r\n");
		js.append("}\r\n");
		js.append("function item_get_itemIcon (obj) {\r\n");
		js.append("//	alert((this.n_depth ? 0 : 32) + (this.a_children.length ? 16 : 0) + (this.a_children.length && this.b_opened ? 8 : 0) + (!b_junction && this.o_root.o_selected == this ? 4 : 0) + (b_junction ? 2 : 0) + (b_junction && this.is_last() ? 1 : 0));\r\n");
		js.append("	return obj.imageName;\r\n");
		js.append("}\r\n");
		js.append("function item_addNode(id,text)\r\n");
		js.append("{\r\n");
		js.append("		var tempNode=this.getChild(id);\r\n");
		js.append("		if(tempNode!=null) return null;   //ͬ��node�Ѿ�����\r\n");
		js.append("		var len=this.a_config.length;	\r\n");
		js.append("		var newItem;\r\n");
		js.append("		if(this.n_fieldCount>4) newItem=[text,id,'','','false'];\r\n");
		js.append("		else newItem=[text,id,'',''];\r\n");
		js.append("		this.a_config[len]=newItem;	\r\n");
		js.append("		this.a_children[this.a_children.length]=new tree_item(this,this.a_children.length);	\r\n");
		js.append("		var newNode=this.a_children[this.a_children.length-1];	\r\n");
		js.append("		var childrenDivId=\"i_div\"+ this.o_root.n_id + \"_\" + this.n_id ;\r\n");
		js.append("		var childrenDiv=document.getElementById(childrenDivId);\r\n");
		js.append("		if(childrenDiv==null)\r\n");
		js.append("		{	childrenDiv=window.document.createElement(\"div\");		\r\n");
		js.append("			childrenDiv.id=\"i_div\"+ this.o_root.n_id + \"_\" + this.n_id ;\r\n");
		js.append("			childrenDiv.name=childrenDiv.id;\r\n");
		js.append("		}//�ӽڵ㼯��div	\r\n");
		js.append("\r\n");
		js.append("		objdiv=window.document.createElement(\"div\");\r\n");
		js.append("		objdiv.id=this.o_parent.n_id + \"_\" +id \r\n");
		js.append("		objdiv.name=objdiv.id;		       \r\n");
		js.append("        \r\n");
		js.append("		objdiv.innerHTML=newNode.init();	//create node html	\r\n");
		js.append("\r\n");
		js.append("		var curNodeDiv=document.getElementById(this.o_parent.n_id + \"_\" +this.id);\r\n");
		js.append("		childrenDiv.appendChild(objdiv);\r\n");
		js.append("		curNodeDiv.appendChild(childrenDiv);	\r\n");
		js.append("		\r\n");
		js.append("		putInHidden(this.o_root);\r\n");
		js.append("		if(this.a_children.length==1) \r\n");
		js.append("		{\r\n");
		js.append("			document.getElementById(this.o_parent.n_id + \"_\" +this.id).innerHTML = this.init();\r\n");
		js.append("			this.open();\r\n");
		js.append("			this.select();\r\n");
		js.append("		}\r\n");
		js.append("		return newNode;\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function item_getChild(id)\r\n");
		js.append("{\r\n");
		js.append("	for(var i=0;i<this.a_children.length;i++)\r\n");
		js.append("	{	\r\n");
		js.append("		if(this.a_children[i]!=null && this.a_children[i].id===id)\r\n");
		js.append("			return this.a_children[i];\r\n");
		js.append("	}\r\n");
		js.append("	return null;\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function item_removeNode(id)\r\n");
		js.append("{\r\n");
		js.append("	var node=this.getChild(id);\r\n");
		js.append("	var index = node.n_order + (node.n_depth ? node.n_fieldCount : 0);\r\n");
		js.append("	\r\n");
		js.append("	this.a_config.splice(index, 1);\r\n");
		js.append("	if(node!=null)  //found\r\n");
		js.append("	{					\r\n");
		js.append("		var nodeDiv=document.getElementById(\"i_div\" + this.o_root.n_id + \"_\" + this.n_id  );	\r\n");
		js.append("		var childNodeDivs=document.getElementsByName(node.o_parent.n_id + \"_\" + node.id);	\r\n");
		js.append("		var childNodeDiv = null;\r\n");
		js.append("		for(index = 0; index < childNodeDivs.length; index ++){\r\n");
		js.append("			if(nodeDiv.contains(childNodeDivs[index])){\r\n");
		js.append("			childNodeDiv = childNodeDivs[index];\r\n");
		js.append("			break;\r\n");
		js.append("			}\r\n");
		js.append("		}\r\n");
		js.append("		if(childNodeDiv!=null)\r\n");
		js.append("		{\r\n");
		js.append("			nodeDiv.removeChild(childNodeDiv);			\r\n");
		js.append("		}\r\n");
		js.append("		//����ӽڵ㻹δ��ɣ����������Դ��ɾ��\r\n");
		js.append("		for(var i=node.n_order;i<this.a_children.length;i++)\r\n");
		js.append("		     this.a_children[i]=this.a_children[i+1];\r\n");
		js.append("		this.a_children.pop();	\r\n");
		js.append("		if(this.a_children.length <= 0)\r\n");
		js.append("		{\r\n");
		js.append("			document.getElementById(this.o_parent.n_id + \"_\"+this.id).innerHTML = this.init();\r\n");
		js.append("		}				\r\n");
		js.append("		\r\n");
		js.append("	}\r\n");
		js.append("	putInHidden(this.o_root);\r\n");
		js.append("}	\r\n");
		js.append("\r\n");
		js.append("function item_getVisblePrevNode(n_id,event)\r\n");
		js.append("{\r\n");
		js.append("	var o_item = this.o_root.a_index[n_id]; \r\n");
		js.append("	if(o_item.o_parent!=null)  //not root node\r\n");
		js.append("	{	//get from same grade node list					\r\n");
		js.append("		\r\n");
		js.append("		var prev=this.o_root.a_index[n_id-1];\r\n");
		js.append("		if(prev!=null)\r\n");
		js.append("		{\r\n");
		js.append("			if(prev.o_parent!=null)\r\n");
		js.append("			{\r\n");
		js.append("				while(prev.o_parent!=null && prev.o_parent.b_opened===false)	prev=prev.o_parent;			\r\n");
		js.append("				return prev;\r\n");
		js.append("			}\r\n");
		js.append("			else\r\n");
		js.append("				return prev;	\r\n");
		js.append("		}\r\n");
		js.append("		else\r\n");
		js.append("		{\r\n");
		js.append("			var parent=o_item.o_parent;\r\n");
		js.append("			var prev=parent.a_children[o_item.n_order-1];\r\n");
		js.append("			if(prev!=null) return prev;		\r\n");
		js.append("		}			\r\n");
		js.append("	}	\r\n");
		js.append("	return null;\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function item_getVisbleNextNode(n_id)\r\n");
		js.append("{\r\n");
		js.append("	var o_item = this.o_root.a_index[n_id]; \r\n");
		js.append("	var next=this.o_root.a_index[n_id+1];\r\n");
		js.append("	if(next!=null)\r\n");
		js.append("	{	\r\n");
		js.append("		\r\n");
		js.append("		if(next.o_parent===o_item && o_item.b_opened===false)\r\n");
		js.append("		{\r\n");
		js.append("			var next2=o_item.o_parent.a_children[o_item.n_order+1];\r\n");
		js.append("		\r\n");
		js.append("			if(next2!=null)\r\n");
		js.append("				return next2;\r\n");
		js.append("			else	//\r\n");
		js.append("			{\r\n");
		js.append("				var parent=o_item.o_parent;\r\n");
		js.append("				var parentOfParent;\r\n");
		js.append("				if(parent!=null)\r\n");
		js.append("				{\r\n");
		js.append("					parentOfParent=parent.o_parent;\r\n");
		js.append("					if(parentOfParent==null)\r\n");
		js.append("						parentOfParent=parent.o_root;\r\n");
		js.append("					return parentOfParent.a_children[parent.n_order+1];					\r\n");
		js.append("				}				\r\n");
		js.append("			}\r\n");
		js.append("		}\r\n");
		js.append("		else\r\n");
		js.append("			return next;\r\n");
		js.append("	}\r\n");
		js.append("	if(n_id==this.o_root.a_index.length-1) return this.o_root.a_index[0];\r\n");
		js.append("	return null;	\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function item_auto_check(checked)\r\n");
		js.append("{\r\n");
		js.append("	this.checked=checked;\r\n");
		js.append("	var checkBox=document.getElementById(\"ck_\"+this.o_root.n_id + \"_\" + this.n_id );\r\n");	
		js.append("	if(checkBox!=null) checkBox.checked=checked;\r\n");	
		js.append("	changeHiddenCheck(this);\r\n");			
		js.append("}\r\n");
		js.append("function item_check(checked)\r\n");
		js.append("{	\r\n");
		js.append("	this.checked=checked;	\r\n");
		js.append("	//////////////////\r\n");
		js.append("	changeHiddenCheck(this);\r\n");
		js.append("	//�ݹ洦���ӽڵ�\r\n");
		js.append("	checkNode(this,checked);\r\n");
		js.append("	//����ͬ���ڵ㣺������ͬ���ڵ�ѡ�У��򸸽ڵ�Ҳѡ��	\r\n");
		js.append("	\r\n");
		js.append("	if(this.o_root.isSelectedParentNode)\r\n");
		js.append("	{\r\n");
		js.append("		if(checked==true)\r\n");
		js.append("		{\r\n");
		js.append("			var obj=this;\r\n");
		js.append("			while(obj.o_parent!=obj.o_root.a_children[0]&&obj.o_parent!=null)\r\n");
		js.append("			{\r\n");
		js.append("				obj.o_parent.checked=true;\r\n");
		js.append("				var checkBox=document.getElementById(\"ck_\"+obj.o_root.n_id + \"_\" + obj.o_parent.n_id );	\r\n");
		js.append("				if(checkBox!=null) checkBox.checked=checked;\r\n");
		js.append("				changeHiddenCheck(obj);				\r\n");
		js.append("				obj=obj.o_parent\r\n");
		js.append("			}\r\n");
		js.append("			\r\n");
		js.append("		}\r\n");
		js.append("	}\r\n");
		js.append("	\r\n");
		js.append("	//if(checked==false && this.o_parent!=null)\r\n");
		js.append("	//{\r\n");
		js.append("		/*var parent=this.o_parent;		\r\n");
		js.append("		if(parent===this.o_root) return;	\r\n");
		js.append("		do\r\n");
		js.append("		{	var allChecked=(this.checked  &&  getChildrenAllChecked(parent));		\r\n");
		js.append("			if(parent.checked==true) allChecked=true;	\r\n");
		js.append("		    if(this.checked==false) allChecked=false;	\r\n");
		js.append("			var checkBox=document.getElementById(\"ck_\"+parent.o_root.n_id + \"_\" + parent.n_id );		\r\n");
		js.append("			parent.checked=allChecked;\r\n");
		js.append("			if(checkBox!=null) checkBox.checked=allChecked;\r\n");
		js.append("			changeHiddenCheck(parent);\r\n");
		js.append("			parent=parent.o_parent;\r\n");
		js.append("			if(parent==this.o_root) return;\r\n");
		js.append("		}while(parent!=null);*/	\r\n");
		js.append("	//}	\r\n");
		js.append("}\r\n");
		js.append("function getChildrenAllChecked(node)\r\n");
		js.append("{	\r\n");
		js.append("	for(var i=0;i<node.a_children.length;i++)\r\n");
		js.append("	{\r\n");
		js.append("		var child=node.a_children[i];	\r\n");
		js.append("		if(child!=null && child.checked==false)\r\n");
		js.append("			return false;\r\n");
		js.append("	}	\r\n");
		js.append("	return true;\r\n");
		js.append("}\r\n");
		js.append("//�ǳ�Ա��������ֻ��treeItem��ʹ��\r\n");
		js.append("function checkNode(node,checked)\r\n");
		js.append("{\r\n");
		js.append("	for(var i=0;i<node.a_children.length;i++)\r\n");
		js.append("	{\r\n");
		js.append("		var childNode=node.a_children[i];	\r\n");
		js.append("		if(childNode!=null)\r\n");
		js.append("		{\r\n");
		js.append("			childNode.checked=checked;\r\n");
		js.append("			var checkBox=document.getElementById(\"ck_\"+childNode.o_root.n_id + \"_\" + childNode.n_id );\r\n");
		js.append("			if(checkBox!=null) checkBox.checked=checked;\r\n");
		js.append("			changeHiddenCheck(childNode);\r\n");
		js.append("			if(childNode.a_children.length>0)\r\n");
		js.append("			    childNode.check(checked);\r\n");
		js.append("		}	\r\n");
		js.append("	}\r\n");
		js.append("}\r\n");
		js.append("\r\n");
		js.append("function changeHiddenCheck(node)\r\n");
		js.append("{	\r\n");
		js.append("	var nodeInfo=\"\";\r\n");
		js.append("	if(node==node.o_root) return;\r\n");
		js.append("	if(node.o_root.treeHidden!=null)\r\n");
		js.append("		nodeInfo=HashtableManager_Get(node.id,node.o_root.treeHidden);	\r\n");
		js.append("	if(nodeInfo==null)return;\r\n");
		js.append("	if(node.checked==false && nodeInfo.indexOf(\"check=true\")>0)\r\n");
		js.append("		nodeInfo=nodeInfo.replace(\"check=true\",\"check=false\");				\r\n");
		js.append("	else if(node.checked==true &&  nodeInfo.indexOf(\"check=false\")>0)\r\n");
		js.append("		nodeInfo=nodeInfo.replace(\"check=false\",\"check=true\");		\r\n");
		js.append("		\r\n");
		js.append("	HashtableManager_Set(node.id,  nodeInfo,  node.o_root.treeHidden);	\r\n");
		js.append("	var invalidFlagIndex=node.o_root.treeHidden.value.indexOf(\"`undefined\");	\r\n");
		js.append("	while(invalidFlagIndex>=0)\r\n");
		js.append("	{	\r\n");
		js.append("		node.o_root.treeHidden.value=node.o_root.treeHidden.value.substring(invalidFlagIndex+\"`undefined\".length);	\r\n");
		js.append("		invalidFlagIndex=node.o_root.treeHidden.value.indexOf(\"`undefined\");\r\n");
		js.append("	}	//putInHidden(this.o_root);\r\n");
		js.append("}");
		jstool.js = js;
		return jstool.getComponentJS();
	}
}
