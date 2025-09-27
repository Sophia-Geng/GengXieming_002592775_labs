/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class Product {
    String name;
    String description;
    String availNum;
    String price;
    Address manufactureAddress;
    Address shippingAddress;
    
    public Product(){
        manufactureAddress=new Address();
        shippingAddress=new Address();
    }

// 初始状态：声明时 manufactureAddress 和 shippingAddress 都是 null
// 创建对象：new Address() 在内存中创建了一个新的 Address 对象
// 赋值：将新创建的对象地址赋给这两个变量
// 把 new Address() 放到 Product() 构造函数里：
// 构造函数的作用：
// 构造函数是创建对象时自动调用的特殊方法
// 用来初始化对象的属性，确保对象创建后处于可用状态
// 每次创建 Product 对象时，这两个地址字段都会被正确初始化
    //new_dict

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailNum() {
        return availNum;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Address getManufactureAddress() {
        return manufactureAddress;
    }

    public void setManufactureAddress(Address manufactureAddress) {
        this.manufactureAddress = manufactureAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
