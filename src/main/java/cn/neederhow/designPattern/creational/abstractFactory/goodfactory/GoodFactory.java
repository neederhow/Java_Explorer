package cn.neederhow.designPattern.creational.abstractFactory.goodfactory;

import cn.neederhow.designPattern.creational.abstractFactory.service.AbstractFactory;
import cn.neederhow.designPattern.creational.abstractFactory.service.HtmlDocument;
import cn.neederhow.designPattern.creational.abstractFactory.service.WordDocument;

public class GoodFactory implements AbstractFactory {

	@Override
	public HtmlDocument createHtml(String md) {
		return new GoodHtmlDocument(md);
	}

	@Override
	public WordDocument createWord(String md) {
		return new GoodWordDocument(md);
	}
}
