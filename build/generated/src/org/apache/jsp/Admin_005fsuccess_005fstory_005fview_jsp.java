package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Admin_005fsuccess_005fstory_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/User_header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin_success_story_view</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body\n");
      out.write("            {               \n");
      out.write("                background:url(Imagess/homeImg2.jpg);\n");
      out.write("                background-position:center;\n");
      out.write("                background-size: cover;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*           .jumbotron\n");
      out.write("                        {\n");
      out.write("                            display: inline-block;\n");
      out.write("                            margin-top: 20px;\n");
      out.write("                            padding-bottom: 20px;\n");
      out.write("                            background-color: whitesmoke;\n");
      out.write("                            \n");
      out.write("                        }\n");
      out.write("            */\n");
      out.write("\n");
      out.write("\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                text-align: center;\n");
      out.write("                color: black; font-family: 'Times New Roman'; font-weight: bold;\n");
      out.write("\n");
      out.write("            }  \n");
      out.write("            h4\n");
      out.write("            {\n");
      out.write("                color: brown; font-family: 'Times New Roman'; font-weight: bold;\n");
      out.write("            }\n");
      out.write("            h5\n");
      out.write("            {\n");
      out.write("                color: black; font-family: 'Times New Roman'; font-weight: bold;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User_header Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap');\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: #ffff;\n");
      out.write("                font-family: 'Poppins', sans-serif;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .visually-hidden{\n");
      out.write("                position: absolute;\n");
      out.write("                height: 1px;\n");
      out.write("                width: 1px;\n");
      out.write("                white-space: nowrap;\n");
      out.write("                clip-path: inset(-50%); \n");
      out.write("                clip: rect(0 0 0 0);\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .main-header{\n");
      out.write("                display: flex;\n");
      out.write("                width: 100%;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                padding: 5px 15px;\n");
      out.write("                background-color: #ff6500;\n");
      out.write("                color: #fff;\n");
      out.write("                height: 64px;\n");
      out.write("            }\n");
      out.write("            .logo svg{\n");
      out.write("                height: 45px;\n");
      out.write("                width: 45px;\n");
      out.write("            }\n");
      out.write("            .logo svg path:nth-child(1){\n");
      out.write("                stroke: #e1e1e1;\n");
      out.write("            }\n");
      out.write("            .logo svg path:nth-child(2){\n");
      out.write("                stroke: #fff;\n");
      out.write("            }\n");
      out.write("            .menu-toggle-btn{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                background: transparent;\n");
      out.write("                border: 0;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .menu-toggle-btn path{\n");
      out.write("                stroke-width: 1px;\n");
      out.write("                transform-box: fill-box;\n");
      out.write("                transition: 250ms;\n");
      out.write("                transform-origin: center;\n");
      out.write("            }\n");
      out.write("            .menu-toggle-btn[aria-expanded=\"true\"] path:nth-child(1){\n");
      out.write("                opacity: 0;\n");
      out.write("                transform: rotate(45deg);\n");
      out.write("            }\n");
      out.write("            .menu-toggle-btn[aria-expanded=\"true\"] path:nth-child(2){\n");
      out.write("                transform: rotate(45deg);\n");
      out.write("            }\n");
      out.write("            .menu-toggle-btn[aria-expanded=\"true\"] path:nth-child(3){\n");
      out.write("                transform: translateY(-5px) rotate(-45deg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .primary-navigation{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 64px;\n");
      out.write("                background: #1b2030;\n");
      out.write("                color: #fff;\n");
      out.write("/*                   height: calc(100vh - 64px);*/\n");
      out.write("                right: 0px;\n");
      out.write("                width: 250px;\n");
      out.write("                list-style-type: none;\n");
      out.write("            }\n");
      out.write("            .primary-navigation a{\n");
      out.write("                position: relative;\n");
      out.write("                width: 100%;\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 15px;\n");
      out.write("                color: #fff;\n");
      out.write("                border-bottom: 1px solid #353842;\n");
      out.write("                transition: 300ms;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .primary-navigation a:hover,\n");
      out.write("            .primary-navigation a:focus{\n");
      out.write("                color: #ff6500;\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("            }\n");
      out.write("            .primary-navigation a:hover:before,\n");
      out.write("            .primary-navigation a:focus:before{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .primary-navigation a:before{\n");
      out.write("                content: \"\";\n");
      out.write("                height: 1px;\n");
      out.write("                width: 0%;\n");
      out.write("                background-color: #ff6500;\n");
      out.write("                transition: 250ms;\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 0;\n");
      out.write("                left: 0;\n");
      out.write("            }\n");
      out.write("            .primary-navigation[data-state=\"opened\"]{\n");
      out.write("                display: block;\n");
      out.write("                animation: navigationOpenAnimation 250ms ease-in-out forwards;\n");
      out.write("            }\n");
      out.write("            .primary-navigation[data-state=\"closing\"]{\n");
      out.write("                animation: navigationCloseAnimation 250ms ease-in-out forwards;\n");
      out.write("            }\n");
      out.write("            .primary-navigation[data-state=\"closed\"]{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes navigationOpenAnimation{\n");
      out.write("                0%{\n");
      out.write("                    clip-path: circle(0% at top right);\n");
      out.write("                }\n");
      out.write("                100%{\n");
      out.write("                    clip-path: circle(250% at top right);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes navigationCloseAnimation{\n");
      out.write("                0%{\n");
      out.write("                    clip-path: circle(250% at top right);\n");
      out.write("                }\n");
      out.write("                100%{\n");
      out.write("                    clip-path: circle(0% at top right);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @-webkit-keyframes navigationOpenAnimation{\n");
      out.write("                0%{\n");
      out.write("                    clip-path: circle(0% at top right);\n");
      out.write("                }\n");
      out.write("                100%{\n");
      out.write("                    clip-path: circle(250% at top right);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @-webkit-keyframes navigationCloseAnimation{\n");
      out.write("                0%{\n");
      out.write("                    clip-path: circle(250% at top right);\n");
      out.write("                }\n");
      out.write("                100%{\n");
      out.write("                    clip-path: circle(0% at top right);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style The Dropdown Button */\n");
      out.write("            .dropbtn {\n");
      out.write("                background-color: #1b2030;\n");
      out.write("                color: white;\n");
      out.write("                padding: 5px;\n");
      out.write("                min-width:200px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* The container <div> - needed to position the dropdown content */\n");
      out.write("            .dropdown {\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Dropdown Content (Hidden by Default) */\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #ff6500;\n");
      out.write("                min-width:250px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Links inside the dropdown */\n");
      out.write("            .dropdown-content a {\n");
      out.write("                color: black;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Change color of dropdown links on hover */\n");
      out.write("            .dropdown-content a:hover {background-color: #ffff}\n");
      out.write("\n");
      out.write("            /* Show the dropdown menu on hover */\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            Change the background color of the dropdown button when the dropdown content is shown \n");
      out.write("            .dropdown:hover .dropbtn {\n");
      out.write("                background-color: #1b2030;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <a href=\"#\" class=\"logo\" \n");
      out.write("               aria-label=\"Logo\">\n");
      out.write("                <svg aria-hidden=\"true\" height=\"50\" width=\"50\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 16 16\"><path stroke=\"#000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M14 10.7V5.3a1.3 1.3 0 0 0-.7-1.1L8.7 1.5a1.3 1.3 0 0 0-1.4 0L2.7 4.2A1.3 1.3 0 0 0 2 5.3v5.4a1.3 1.3 0 0 0 .7 1.1l4.6 2.7a1.3 1.3 0 0 0 1.4 0l4.6-2.7a1.3 1.3 0 0 0 .7-1.1Z\"/><path stroke=\"#000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M2.2 4.6 8 8l5.8-3.4M8 14.7V8\"/></svg>\n");
      out.write("            </a>\n");
      out.write("            <nav>\n");
      out.write("                <button class=\"menu-toggle-btn\" \n");
      out.write("                        aria-targe=\"primary-navigation\" \n");
      out.write("                        aria-expanded=\"false\" \n");
      out.write("                        aria-controls=\"primary-navigation\">\n");
      out.write("                    <span class=\"visually-hidden\">Menu</span>\n");
      out.write("                    <svg aria-hidden=\"true\" height=\"35\" width=\"35\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 16 16\"><path stroke=\"#fff\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M14 3H2\"/><path stroke=\"#fff\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M14 8H2\"/><path stroke=\"#fff\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M14 13H2\"/></svg>\n");
      out.write("                </button>\n");
      out.write("                <ul data-state=\"closed\" class=\"primary-navigation\" id=\"primary-navigation\">\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Homepage.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Admin_success_story_view.jsp\">View Success Story</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"User_Success_Story.jsp\">Add Success Story</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Basic_details.jsp\">Add Basic Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Basic_details_view.jsp\">View Basic Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Basic_details_User_profile.jsp\">Basic Details User Profile</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Address.jsp\">Add Address Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Address_view.jsp\">Address Details View</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Ethinicity.jsp\">Add Ethnicity Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Ethinicity_view.jsp\">View Ethnicity Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Career.jsp\">Add Career Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Career_view.jsp\">View Career Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Working.jsp\">Add Working Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Working_view.jsp\">View Working Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Social.jsp\">Add Social Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Social_view.jsp\">View Social Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Family.jsp\">Add Family Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Family_view.jsp\">View Family Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Lifestyle.jsp\">Add Lifestyle Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Lifetyle_view.jsp\">View Lifestyle Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Partner_preferance.jsp\">Partner Preferance Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Partner_preferance_view.jsp\">ViewPartner Preferance Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Search_partner_profile.jsp\">Search Partner Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Search_partner_profile_view.jsp\">View Search Partner Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\"><a href=\"Contact.jsp\">Add Contact Details</a></button>\n");
      out.write("                        <div class=\"dropdown-content\" >\n");
      out.write("                            <li><a href=\"Contact_view.jsp\">View Contact Details</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Feedback.jsp\"> Feedback </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            const menuToggleBtn = document.querySelector(\".menu-toggle-btn\");\n");
      out.write("            const primaryNav = document.querySelector(\".primary-navigation\");\n");
      out.write("\n");
      out.write("            menuToggleBtn.addEventListener('click', () => {\n");
      out.write("                let isNavOpen = menuToggleBtn.getAttribute('aria-expanded') === 'true';\n");
      out.write("                isNavOpen ? primaryMenuClose() : primaryMenuOpen();\n");
      out.write("            })\n");
      out.write("\n");
      out.write("            function primaryMenuOpen() {\n");
      out.write("                menuToggleBtn.setAttribute('aria-expanded', 'true');\n");
      out.write("                primaryNav.setAttribute('data-state', 'opened');\n");
      out.write("            }\n");
      out.write("            function primaryMenuClose() {\n");
      out.write("                menuToggleBtn.setAttribute('aria-expanded', 'false');\n");
      out.write("                primaryNav.setAttribute('data-state', 'closing');\n");
      out.write("                primaryNav.addEventListener('animationend', () => {\n");
      out.write("                    primaryNav.setAttribute('data-state', 'closed');\n");
      out.write("                }, {once: true})\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                <h1> Success Stories</h1><hr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                    ");


                        Connection cn = null;
                        Statement st = null;
                        int counter = 1;

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_matrimonial_website", "root", "root");
                            st = cn.createStatement();
                            String sql = "select * from admin_success_story";

                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"jumbotron\" class=\"form-group\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <h5>User ID :");
      out.print(rs.getString("uid"));
      out.write("</h5>\n");
      out.write("                            <img src=");
      out.print(rs.getString("img"));
      out.write(" width=\"300\" height=\"300\"/>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-1 \" class=\"border-top\"></div>\n");
      out.write("                        <div class=\"col-sm-6 \"><br>\n");
      out.write("                            <h4> First User :</h4>\n");
      out.write("                            <h5>");
      out.print(rs.getString("fname"));
      out.write("</h5><br>\n");
      out.write("                            <h4>Second User :</h4>\n");
      out.write("                            <h5>");
      out.print(rs.getString("sname"));
      out.write("</h5><br>\n");
      out.write("                            <h4> Description :</h4>\n");
      out.write("                            <h5>");
      out.print(rs.getString("descr"));
      out.write("</h5><br>\n");
      out.write("                            <a href=\"Homepage.jsp\" > <input type=\"Submit\" name=\"btn\"  value=\"Click here to know more\"class=\"btn btn-dark form-control\"   style=\"font-family: 'Times New Roman';\"></a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                        }
                    } catch (Exception ex) {

                    }

                
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
