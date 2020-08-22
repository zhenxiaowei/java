package aspose;

public class Test {
	public static void testWord(String path_word, String pafpath) throws Exception {
		String word1 = path_word + "01正方数字.docx";
		String word2 = path_word + "02正方数字.docx";
		String word3 = path_word + "03正方数字.doc";
		String word4 = path_word + "04正方数字.doc";
		String word5 = path_word + "05正方数字.docx";
		String word6 = path_word + "06正方数字.doc";

		AsposeUtil.trans(word1, pafpath + "aspose-word-01测试.pdf","word");
		AsposeUtil.trans(word2, pafpath + "aspose-word-02测试.pdf","word");
		AsposeUtil.trans(word3, pafpath + "aspose-word-03测试.pdf","word");
		AsposeUtil.trans(word4, pafpath + "aspose-word-04测试.pdf","word");
		AsposeUtil.trans(word5, pafpath + "aspose-word-05测试.pdf","word");
		AsposeUtil.trans(word6, pafpath + "aspose-word-06测试.pdf","word");
	}

	public static void testWord2(String path_word, String pafpath) throws Exception {
		String word1 = path_word + "01.docx";
		String word2 = path_word + "02.docx";
		String word3 = path_word + "03.doc";
		String word4 = path_word + "04.doc";
		String word5 = path_word + "05.docx";
		String word6 = path_word + "06.doc";

		AsposeUtil.trans(word1, pafpath + "aspose-word-01.pdf","word");
		AsposeUtil.trans(word2, pafpath + "aspose-word-02.pdf","word");
		AsposeUtil.trans(word3, pafpath + "aspose-word-03.pdf","word");
		AsposeUtil.trans(word4, pafpath + "aspose-word-04.pdf","word");
		AsposeUtil.trans(word5, pafpath + "aspose-word-05.pdf","word");
		AsposeUtil.trans(word6, pafpath + "aspose-word-06.pdf","word");

	}

	public static void testTxt(String path_word, String pafpath) throws Exception {
		String txt1 = path_word + "01jvm.txt";
		String txt2 = path_word + "02jvm.txt";
		String txt3 = path_word + "03jvm.txt";

		AsposeUtil.trans(txt1, pafpath + "aspose-txt-01测试.pdf","txt");
		AsposeUtil.trans(txt2, pafpath + "aspose-txt-02测试.pdf","txt");
		AsposeUtil.trans(txt3, pafpath + "aspose-txt-03测试.pdf","txt");
	}

	public static void testTxt2(String path_word, String pafpath) throws Exception {
		String txt1 = path_word + "01jvm.txt";
		String txt2 = path_word + "02jvm.txt";
		String txt3 = path_word + "03jvm.txt";

		AsposeUtil.trans(txt1, pafpath + "aspose-txt-01.pdf","txt");
		AsposeUtil.trans(txt2, pafpath + "aspose-txt-02.pdf","txt");
		AsposeUtil.trans(txt3, pafpath + "aspose-txt-03.pdf","txt");
	}

	public static void testExcel(String path_word, String pafpath) throws Exception {

		String txt1 = path_word + "01部门开发任务管理.xlsx";
		String txt2 = path_word + "02部门开发任务管理.xlsx";
		String txt3 = path_word + "03部门开发任务管理.xlsx";

		AsposeUtil.trans(txt1, pafpath + "aspose-excel-01测试.pdf","txt");
		AsposeUtil.trans(txt2, pafpath + "aspose-excel-02测试.pdf","txt");
		AsposeUtil.trans(txt3, pafpath + "aspose-excel-03测试.pdf","txt");
	}

	public static void testExcel2(String path_word, String pafpath) throws Exception {

		String txt1 = path_word + "01.xlsx";
		String txt2 = path_word + "02.xlsx";
		String txt3 = path_word + "03.xlsx";

		AsposeUtil.trans(txt1, pafpath + "aspose-excel-01.pdf","txt");
		AsposeUtil.trans(txt2, pafpath + "aspose-excel-02.pdf","txt");
		AsposeUtil.trans(txt3, pafpath + "aspose-excel-03.pdf","txt");
	}

	public static void testPPt(String path_ppt, String pafpath) throws Exception {
		String txt1 = path_ppt + "01jquery.pptx";
		String txt2 = path_ppt + "02jquery.pptx";
		String txt3 = path_ppt + "03jquery.ppt";

		AsposeUtil.trans(txt1, pafpath + "aspose-ppt-01测试.pdf","ppt");
		AsposeUtil.trans(txt2, pafpath + "aspose-ppt-02测试.pdf","ppt");
		AsposeUtil.trans(txt3, pafpath + "aspose-ppt-03测试.pdf","ppt");
	}

	public static void testPPt2(String path_ppt, String pafpath) throws Exception {
		String txt1 = path_ppt + "01jquery.pptx";
		String txt2 = path_ppt + "02jquery.pptx";
		String txt3 = path_ppt + "03jquery培训.ppt";

		AsposeUtil.trans(txt1, pafpath + "aspose-ppt-01.pdf","ppt");
		AsposeUtil.trans(txt2, pafpath + "aspose-ppt-02.pdf","ppt");
		AsposeUtil.trans(txt3, pafpath + "aspose-ppt-03.pdf","ppt");
	}

	public static void winTest() throws Exception {
		String path_word = "C:/Users/Administrator/Desktop/office转pdf/测试文档/转换前文档/01word";
//		String path_txt = "C:/Users/Administrator.DESKTOP-QN9A3AA/Desktop/office/测试文档/转换前文档/02txt/";
//		String path_excel = "C:/Users/Administrator.DESKTOP-QN9A3AA/Desktop/office/测试文档/转换前文档/03excel/";
//		String path_ppt = "C:/Users/Administrator.DESKTOP-QN9A3AA/Desktop/office/测试文档/转换前文档/04ppt/";
		String pafpath = "C:/Users/Administrator/Desktop/office转pdf/测试文档/pdf/";

		System.out.println("************************");
		testWord(path_word, pafpath);
		System.out.println("************************");
		//testTxt(path_txt, pafpath);
		System.out.println("************************");
		//testExcel(path_excel, pafpath);
		System.out.println("************************");
		//testPPt(path_ppt, pafpath);
	}

	public static void LinuxTest() throws Exception {
		String path_word = "/software/songyan/hah/01word/";
		String path_txt = "/software/songyan/hah/02txt/";
		String path_excel = "/software/songyan/hah/03excel/";
		String path_ppt = "/software/songyan/hah/04ppt/";
		String pafpath = "/software/songyan/hah/pdf/";

		System.out.println("************************");
		testWord(path_word, pafpath);
		System.out.println("************************");
		testTxt(path_txt, pafpath);
		System.out.println("************************");
		testExcel(path_excel, pafpath);
		System.out.println("************************");
		testPPt(path_ppt, pafpath);
	}

	public static void LinuxTest2() throws Exception {
		String path_word = "/software/songyan/hah/01word/";
		String path_txt = "/software/songyan/hah/02txt/";
		String path_excel = "/software/songyan/hah/03excel/";
		String path_ppt = "/software/songyan/hah/04ppt/";
		String pafpath = "/software/songyan/hah/pdf/";

		System.out.println("************************");
		testWord2(path_word, pafpath);
		System.out.println("************************");
		testTxt2(path_txt, pafpath);
		System.out.println("************************");
		testExcel2(path_excel, pafpath);
		System.out.println("************************");
		testPPt2(path_ppt, pafpath);
	}

	public static void main(String[] args) throws Exception {
		//winTest();
		AsposeUtil.trans("C:/Users/Administrator/Desktop/office转pdf/测试文档/转换前文档/01word/01.docx", "C:/Users/Administrator/Desktop/office转pdf/测试文档/pdf/word.pdf","word");
		AsposeUtil.trans("C:/Users/Administrator/Desktop/office转pdf/测试文档/转换前文档/03excel/01.xlsx", "C:/Users/Administrator/Desktop/office转pdf/测试文档/pdf/xlsx.pdf","excel");
		AsposeUtil.trans("C:/Users/Administrator/Desktop/office转pdf/测试文档/转换前文档/02txt/01jvm.txt", "C:/Users/Administrator/Desktop/office转pdf/测试文档/pdf/txt.pdf","txt");
		AsposeUtil.trans("C:/Users/Administrator/Desktop/office转pdf/测试文档/转换前文档/04ppt/01jquery.pptx", "C:/Users/Administrator/Desktop/office转pdf/测试文档/pdf/ppt.pdf","ppt");
	}

}