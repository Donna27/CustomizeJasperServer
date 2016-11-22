package com.ost.jasper.theme;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

public class BarCharForm58To61 implements JRChartCustomizer {

	public void customize(JFreeChart chart, JRChart jasperChart) {
		 CategoryPlot categoryPlot = chart.getCategoryPlot();
	        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();

	        //set Max bar width
	        renderer.setMaximumBarWidth(0.1); // กำหนดขนาดของกราฟแท่งที่แสดงข้อมูล
	}

}
