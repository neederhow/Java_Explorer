package cn.neederhow.designPattern.creational.abstractFactory.fastfactory;

import cn.neederhow.designPattern.creational.abstractFactory.service.AbstractFactory;
import cn.neederhow.designPattern.creational.abstractFactory.service.HtmlDocument;
import cn.neederhow.designPattern.creational.abstractFactory.service.WordDocument;

public class FastFactory implements AbstractFactory {

	@Override
	public HtmlDocument createHtml(String md) {
		return new FastHtmlDocument(md);
	}

	@Override
	public WordDocument createWord(String md) {
		return new FastWordDocument(md);
	}
}
