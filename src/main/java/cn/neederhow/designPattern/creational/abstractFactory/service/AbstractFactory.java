package cn.neederhow.designPattern.creational.abstractFactory.service;

public interface AbstractFactory {

	HtmlDocument createHtml(String md);

	WordDocument createWord(String md);

}
