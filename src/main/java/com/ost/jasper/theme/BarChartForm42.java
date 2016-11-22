package com.ost.jasper.theme;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

public class BarChartForm42 implements JRChartCustomizer{

	public void customize(JFreeChart chart, JRChart jasperChart) {
		CategoryPlot categoryPlot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        //set Max bar width and remove Spaces between bars
        renderer.setItemMargin(-0.2); //กำหนดระยะห่างของกราฟแท่ง ค่าติดลบจะทำให้กราฟแท่งเข้าหากัน
        renderer.setMaximumBarWidth(0.1); // กำหนดขนาดของกราฟแท่งที่แสดงข้อมูล
	}
}
