package com.ost.jasper.theme;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

public class DistanceBetweenBar implements JRChartCustomizer {

	public void customize(JFreeChart chart, JRChart jasperChart) {

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();

        //Remove spaces between bars
        renderer.setItemMargin(0.0); // กำหนดให้กราฟแท่งสองอันติดกัน โดยที่ความกว้างของกราฟยังเท่าเดิม
    }

}
