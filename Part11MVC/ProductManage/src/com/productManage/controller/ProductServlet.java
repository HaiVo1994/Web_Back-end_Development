package com.productManage.controller;

import com.productManage.model.Product;
import com.productManage.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet")
public class ProductServlet extends HttpServlet {
    private ProductServiceImpl productService = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String doing = request.getParameter("doing");
        if (doing==null)
            doing = "";
        switch (doing){
            case "create":
                createProduct(request, response);
                break;
            case "update":
                updateProduct(request, response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            case "find":
                break;
            default:
                showAllProduct(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String doing = request.getParameter("doing");
        if (doing==null)
            doing = "";
        switch (doing){
            case "create":
                showFormToCreate(request, response);
                break;
            case "update":
                showUpdateForm(request, response);
                break;
            case "delete":
                showRemoveForm(request, response);
                break;
            case "view":
                showProduct(request,response);
                break;
            case "find":
                findProduct(request, response);
                break;
            default:
                showAllProduct(request,response);
        }
    }

    private void showAllProduct(HttpServletRequest request, HttpServletResponse response){
        List<Product> products = this.productService.getAll();
        request.setAttribute("productArray", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("manage/showProduct.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException | IOException e){
            e.printStackTrace();
        }
    }

    private void showFormToCreate(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("manage/create.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException | IOException e){
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response){
        Product product = new Product();
        product.setId(Integer.parseInt(request.getParameter("id")));
        product.setName(request.getParameter("name"));
        product.setPrice(Integer.parseInt(request.getParameter("price")));
        product.setDepiction(request.getParameter("depiction"));
        product.setProducer(request.getParameter("producer"));
        this.productService.create(product);
        try {
            response.sendRedirect("product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void errorFind(HttpServletRequest request, HttpServletResponse response, String messenger) {
        request.setAttribute("messenger",messenger);
        RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException | IOException e){
            e.printStackTrace();
        }
    }
    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product productUpdate = this.productService.getById(id);
        if (productUpdate!=null){
            request.setAttribute("productUpdate", productUpdate);
            RequestDispatcher dispatcher = request.getRequestDispatcher("manage/update.jsp");
            try{
                dispatcher.forward(request,response);
            }catch (ServletException | IOException e){
                e.printStackTrace();
            }
        }
        else
            errorFind(request, response,"Product can't be found");
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response){
        Product product = new Product();
        int id = Integer.parseInt(request.getParameter("id"));
        product.setId(id);
        product.setName(request.getParameter("name"));
        product.setPrice(Integer.parseInt(request.getParameter("price")));
        product.setDepiction(request.getParameter("depiction"));
        product.setProducer(request.getParameter("producer"));
        this.productService.update(id,product);
        try {
            response.sendRedirect("product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showRemoveForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product productUpdate = this.productService.getById(id);

        if (productUpdate!=null){
            request.setAttribute("productUpdate", productUpdate);
            RequestDispatcher dispatcher = request.getRequestDispatcher("manage/delete.jsp");
            try{
                dispatcher.forward(request,response);
            }catch (ServletException | IOException e){
                e.printStackTrace();
            }
        }
        else
            errorFind(request, response,"Product can't be found");
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        this.productService.delete(id);
        try {
            response.sendRedirect("product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showProduct(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product productFound = this.productService.getById(id);

        if (productFound!=null){
            request.setAttribute("productFound", productFound);
            RequestDispatcher dispatcher = request.getRequestDispatcher("manage/viewProduct.jsp");
            try{
                dispatcher.forward(request,response);
            }catch (ServletException | IOException e){
                e.printStackTrace();
            }
        }
        else
            errorFind(request, response,"Product can't be found");
    }
    private void findProduct(HttpServletRequest request, HttpServletResponse response){
        String nameToSearch =request.getParameter("nameToSearch");
        Product productFound = this.productService.findByName(nameToSearch);
        if (productFound!=null){
            request.setAttribute("productFound", productFound);
            RequestDispatcher dispatcher = request.getRequestDispatcher("manage/viewProduct.jsp");
            try{
                dispatcher.forward(request,response);
            }catch (ServletException | IOException e){
                e.printStackTrace();
            }
        }
        else
            errorFind(request, response,"Name of product can't be found");
    }
}
