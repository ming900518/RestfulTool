/*
  Copyright (C), 2018-2020, ZhangYuanSheng
  FileName: ScanServicesWithLibraryDefault
  Author:   ZhangYuanSheng
  Date:     2020/8/6 00:42
  Description: 默认初始：扫描service时是否扫描lib（与项目配置分开）
  History:
  <author>          <time>          <version>          <desc>
  作者姓名            修改时间           版本号              描述
 */
package com.github.restful.tool.beans.settings;

import com.github.restful.tool.view.window.options.items.CustomCheckBox;

/**
 * 是否启用RestDetail的cache缓存
 *
 * @author ZhangYuanSheng
 * @version 1.0
 */
public class ExpandOfServiceTree extends CustomCheckBox {

    public ExpandOfServiceTree() {
        super(
                "Whether to expand the ServiceTree by default?",
                "expandOfServiceTree"
        );
    }
}