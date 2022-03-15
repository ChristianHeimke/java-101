/***************************************************************************************************
        dirty code aufgeräumt

        * beispiel für schlecht lesbaren code wenn man ihn aufräumt

***************************************************************************************************/
class DirtyCodeCleanUp {
	public static void main(String[] ignored) {
		int zero = 0;
		int one = 1;
		int whatsThis = zero;

		whatsThis = one;

		System.out.println(0);
		System.out.println(zero);
		System.out.println(whatsThis);
		System.out.println(whatsThis);
	}
}