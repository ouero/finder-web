/*
 * $RCSfile: ConfigTemplate.java,v $
 * $Revision: 1.1 $
 *
 * JSP generated by JspCompiler-1.0.0
 */
package com.skin.finder.servlet.template;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * <p>Title: ConfigTemplate</p>
 * <p>Description: </p>
 * @author JspKit
 * @version 1.0
 */
public class ConfigTemplate extends com.skin.finder.web.servlet.JspServlet {
    private static final long serialVersionUID = 1L;
    private static final ConfigTemplate instance = new ConfigTemplate();


    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    public static void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        instance.service(request, response);
    }

    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        out.write("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
        out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n<meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\r\n");
        out.write("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n<title>Preferences</title>\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
        this.print(out, request.getAttribute("requestURI"));
        out.write("?action=res&path=/finder/css/form.css\"/>\r\n<script type=\"text/javascript\" src=\"");
        this.print(out, request.getAttribute("requestURI"));
        out.write("?action=res&path=/finder/jquery-1.7.2.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"");
        this.print(out, request.getAttribute("requestURI"));
        out.write("?action=res&path=/finder/charset.js\"></script>\r\n<script type=\"text/javascript\" src=\"");
        this.print(out, request.getAttribute("requestURI"));
        out.write("?action=res&path=/finder/colorpicker.js\"></script>\r\n<script type=\"text/javascript\" src=\"");
        this.print(out, request.getAttribute("requestURI"));
        out.write("?action=res&path=/finder/config.js\"></script>\r\n<script type=\"text/javascript\">\r\n");
        out.write("<!--\r\njQuery(function() {\r\n    var theme = Finder.getConfig(\"global.theme\", \"RDark\");\r\n");
        out.write("    var charset = Finder.getConfig(\"global.charset\", \"utf-8\");\r\n    var fontFamily = Finder.getConfig(\"less.fontFamily\", \"Lucida Console\");\r\n");
        out.write("    var fontColor = Finder.getConfig(\"less.fontColor\", \"#009900\");\r\n    var backgroundColor = Finder.getConfig(\"less.backgroundColor\", \"#000000\");\r\n");
        out.write("    Charset.setup(jQuery(\"select[name=charset]\").get(0), charset);\r\n\r\n    jQuery(\"select[name=theme]\").val(theme);\r\n");
        out.write("    jQuery(\"select[name=fontFamily]\").val(fontFamily);\r\n    jQuery(\"input[name=fontColor]\").val(fontColor);\r\n");
        out.write("    jQuery(\"input[name=backgroundColor]\").val(backgroundColor);\r\n\r\n    jQuery(\"input[name=fontColorPicker]\").css(\"backgroundColor\", fontColor);\r\n");
        out.write("    jQuery(\"input[name=backgroundColorPicker]\").css(\"backgroundColor\", backgroundColor);\r\n");
        out.write("    jQuery(\"#fontExample\").css(\"fontFamily\", fontFamily);\r\n});\r\n\r\njQuery(function() {\r\n");
        out.write("    jQuery(\"input.color-picker\").click(function(event) {\r\n        var position = jQuery(this).position();\r\n");
        out.write("        var x = position.left;\r\n        var y = position.top + jQuery(this).height();\r\n");
        out.write("        var self = jQuery(this);\r\n\r\n        ColorDialog.open(x, y, function(color) {\r\n");
        out.write("            self.css(\"backgroundColor\", color);\r\n            self.parent().find(\"input.color-text\").val(color);\r\n");
        out.write("            ColorDialog.close();\r\n        });\r\n    });\r\n\r\n    jQuery(\"select[name=fontFamily]\").change(function() {\r\n");
        out.write("        jQuery(\"#fontExample\").css(\"fontFamily\", this.value);\r\n    });\r\n\r\n    jQuery(\"#default-btn\").click(function() {\r\n");
        out.write("        jQuery(\"select[name=theme]\").val(\"RDark\");\r\n        jQuery(\"select[name=charset]\").val(\"utf-8\");\r\n");
        out.write("        jQuery(\"select[name=fontFamily]\").val(\"Lucida Console\");\r\n        jQuery(\"input[name=fontColor]\").val(\"#999999\");\r\n");
        out.write("        jQuery(\"input[name=backgroundColor]\").val(\"#000000\");\r\n    });\r\n\r\n    jQuery(\"#ensure-btn\").click(function() {\r\n");
        out.write("        var config = {\"global\": {}, \"less\": {}};\r\n        var global = config.global;\r\n");
        out.write("        var lessConfig = config.less;\r\n\r\n        global.theme = jQuery(\"select[name=theme]\").val();\r\n");
        out.write("        global.charset = jQuery(\"select[name=charset]\").val();\r\n\r\n        lessConfig.fontFamily = jQuery(\"select[name=fontFamily]\").val();\r\n");
        out.write("        lessConfig.fontColor = jQuery(\"input[name=fontColor]\").val();\r\n        lessConfig.backgroundColor = jQuery(\"input[name=backgroundColor]\").val();\r\n");
        out.write("        Finder.setFinderConfig(config);\r\n        window.close();\r\n    });\r\n\r\n    jQuery(\"#cancel-btn\").click(function() {\r\n");
        out.write("        window.close();\r\n    });\r\n});\r\n//-->\r\n</script>\r\n</head>\r\n<body contextPath=\"");
        this.print(out, request.getAttribute("contextPath"));
        out.write("\" workspace=\"");
        this.print(out, request.getAttribute("workspace"));
        out.write("\">\r\n<div>\r\n    <div class=\"finder-nav\">\r\n        <div class=\"menu-head\"><h4>系统选项</h4></div>\r\n");
        out.write("        <div id=\"\" class=\"menu-body\" style=\"margin-top: 10px; white-space: nowrap; overflow: auto;\">\r\n");
        out.write("            <ul class=\"menu\">\r\n                <li class=\"active\"><a href=\"javascript:void(0)\">全局设置</a></li>\r\n");
        out.write("            </ul>\r\n        </div>\r\n    </div>\r\n    <div style=\"margin-left: 220px;\">\r\n");
        out.write("        <div id=\"finder-panel\" class=\"form\">\r\n            <div class=\"menu-panel\"><h4>全局设置</h4></div>\r\n");
        out.write("            <div class=\"form-row\">\r\n                <div class=\"form-label\">主题：</div>\r\n");
        out.write("                <div class=\"form-c300\">\r\n                    <div class=\"form-field\">\r\n");
        out.write("                        <select name=\"theme\">\r\n                            <option value=\"Django\">Django</option>\r\n");
        out.write("                            <option value=\"Eclipse\">Eclipse</option>\r\n                            <option value=\"Emacs\">Emacs</option>\r\n");
        out.write("                            <option value=\"FadeToGrey\">FadeToGrey</option>\r\n                            <option value=\"MDUltra\">MDUltra</option>\r\n");
        out.write("                            <option value=\"Midnight\">Midnight</option>\r\n                            <option value=\"RDark\">RDark</option>\r\n");
        out.write("                        </select>\r\n                    </div>\r\n                </div>\r\n");
        out.write("                <div class=\"form-m300\">\r\n                    <div class=\"form-comment\">主题。</div>\r\n");
        out.write("                </div>\r\n            </div>\r\n            <div class=\"form-row\">\r\n");
        out.write("                <div class=\"form-label\">字符集：</div>\r\n                <div class=\"form-c300\">\r\n");
        out.write("                    <div class=\"form-field\"><select name=\"charset\"></select></div>\r\n");
        out.write("                </div>\r\n                <div class=\"form-m300\">\r\n                    <div class=\"form-comment\">字符集。</div>\r\n");
        out.write("                </div>\r\n            </div>\r\n            <div class=\"form-row\">\r\n");
        out.write("                <div class=\"form-label\">字体：</div>\r\n                <div class=\"form-c300\">\r\n");
        out.write("                    <div class=\"form-field\">\r\n                        <select name=\"fontFamily\">\r\n");
        out.write("                            <option value=\"Andale Mono\">Andale Mono</option>\r\n                            <option value=\"Anonymous\">Anonymous</option>\r\n");
        out.write("                            <option value=\"Consolas\">Consolas</option>\r\n                            <option value=\"Courier New\">Courier New</option>\r\n");
        out.write("                            <option value=\"Dejavu\">Dejavu</option>\r\n                            <option value=\"DroidMono\">DroidMono</option>\r\n");
        out.write("                            <option value=\"EnvyR\">EnvyR</option>\r\n                            <option value=\"FiraCode\">FiraCode</option>\r\n");
        out.write("                            <option value=\"Hasklig\">Hasklig</option>\r\n                            <option value=\"InputMono\">InputMono</option>\r\n");
        out.write("                            <option value=\"liberation\">liberation</option>\r\n                            <option value=\"Lucida Console\">Lucida Console</option>\r\n");
        out.write("                            <option value=\"LucidaMono\">LucidaMono</option>\r\n                            <option value=\"Monaco\">Monaco</option>\r\n");
        out.write("                            <option value=\"Monoid\">Monoid</option>\r\n                            <option value=\"Profont\">Profont</option>\r\n");
        out.write("                            <option value=\"SourceCode\">SourceCode</option>\r\n                            <option value=\"UbuntuMono\">UbuntuMono</option>\r\n");
        out.write("                        </select>\r\n                    </div>\r\n                </div>\r\n");
        out.write("                <div class=\"form-m300\">\r\n                    <div id=\"fontExample\">我是字体示例 abcd ABCD 123</div>\r\n");
        out.write("                </div>\r\n            </div>\r\n            <div class=\"form-row\">\r\n");
        out.write("                <div class=\"form-label\">字体颜色：</div>\r\n                <div class=\"form-c300\">\r\n");
        out.write("                    <div class=\"form-field\">\r\n                        <input name=\"fontColor\" type=\"text\" class=\"color-text\" value=\"\"/>\r\n");
        out.write("                        <input name=\"fontColorPicker\" type=\"text\" class=\"color-picker\" readonly=\"true\" value=\"\"/>\r\n");
        out.write("                    </div>\r\n                </div>\r\n                <div class=\"form-m300\">\r\n");
        out.write("                    <div class=\"form-comment\">字体颜色。</div>\r\n                </div>\r\n");
        out.write("            </div>\r\n            <div class=\"form-row\">\r\n                <div class=\"form-label\">背景颜色：</div>\r\n");
        out.write("                <div class=\"form-c300\">\r\n                    <div class=\"form-field\">\r\n");
        out.write("                        <input name=\"backgroundColor\" type=\"text\" class=\"color-text\" value=\"\"/>\r\n");
        out.write("                        <input name=\"backgroundColorPicker\" type=\"text\" class=\"color-picker\" readonly=\"true\" value=\"\"/>\r\n");
        out.write("                    </div>\r\n                </div>\r\n                <div class=\"form-m300\">\r\n");
        out.write("                    <div class=\"form-comment\">背景颜色。</div>\r\n                </div>\r\n");
        out.write("            </div>\r\n            <div class=\"button\">\r\n                <button id=\"default-btn\" class=\"button\">恢复默认</button>\r\n");
        out.write("                <button id=\"ensure-btn\" class=\"button ensure\">确 定</button>\r\n                <button id=\"cancel-btn\" class=\"button cancel\">取 消 </button>\r\n");
        out.write("            </div>\r\n        </div>\r\n    </div>\r\n</div>\r\n</body>\r\n</html>\r\n");

        out.flush();
    }


}