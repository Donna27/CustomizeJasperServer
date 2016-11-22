# Customize Report on Jasperserver
การแก้ไขกราฟแท่ง
- ศร้าง class แล้วทำการ implements JRChartCustomizer  แล้วจะได้ method ที่ override คือ customize(JFreeChart chart, JRChart jasperChart) สำหรับการแก้ไข กราฟ

- Example
```
package com.ost.jasper.theme;
public class BarChartForm42 implements JRChartCustomizer{

	public void customize(JFreeChart chart, JRChart jasperChart) {
		CategoryPlot categoryPlot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        //set Max bar width and remove Spaces between bars
        renderer.setItemMargin(-0.2); //กำหนดระยะห่างของกราฟแท่ง ค่าติดลบจะทำให้กราฟแท่งเข้าหากัน ถ้าไม่ได้กำหนดขนาดของกราฟแท่ง สามารถใส่ค่าเป็น 0 ได้เลย
        renderer.setMaximumBarWidth(0.1); // กำหนดขนาดของกราฟแท่งที่แสดงข้อมูล
	}
}
```
การนำไปใช้ต้อง build ออกมาให้เป็นไฟล์  .jar 

# รันใน ireport 
	1. เข้าไปที่เมนู Tool->Options->classpath
	2. กดปุ่ม  Add JAR
	3. เลือกกราฟที่ต้องการปรับแก้ 
	4. เลือก Properties -> Customize Class จากนั้น เอาชื่อ class มาใส่ เช่น com.ost.jasper.theme.BarChartForm42
	
# รันใน Jasper Server
	1. เอาไฟล์ JAR ไปวางไว้ใน apache-tomcat-8.0.33\webapps\jasperserver\WEB-INF\lib
	2. Restart jasperserver