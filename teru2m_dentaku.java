class teru2m_dentaku{
  public static int calc(int num1, int num2, String str){
    int result;
    if (str.equals("kake")){
      result = num1 * num2;
    }else if (str.equals("tasu")){
      result = num1 + num2;
    }else if (str.equals("hiku")){
      result = num1 - num2;
    }else{
      if (num2 == 0){
        errDisp("0 ‚ÅŠ„‚ë‚¤‚Æ‚µ‚Ü‚µ‚½");
      }

      result = num1 / num2;
    }

    return result;
  }

  public static void inputCheck(String args[]){
    if (args.length != 3){
      errDisp("ˆø”‚Í3ŒÂ“ü—Í‚µ‚Ä‰º‚³‚¢");
    }
  }

  public static void valCheck(int num1, int num2, String[] args){
    try{
      num1 = Integer.parseInt(args[0]);
      num2 = Integer.parseInt(args[2]);
    }catch(NumberFormatException e){
      errDisp("”’l‚Å‚È‚¢’l‚ª“ü—Í‚³‚ê‚Ä‚¢‚Ü‚·");
    }
  }

  public static void opeCheck(String str){
    String opeStr[] = {"kake", "waru", "tasu", "hiku"};
    boolean errFlag = true;
    for (int i = 0 ; i < 4 ; i++){
      if (str.equals(opeStr[i])){
        errFlag = false;
      }
    }

    if (errFlag == true){
      errDisp("‰‰Zq‚Í kake waru tasu hiku ‚Ì4‚Â‚Å‚·");
    }
  }

  private static void errDisp(String errStr){
    System.out.println("Usage : java dentaku ”’l ‰‰Zq ”’l");
    System.out.println(errStr);
    System.exit(0);  /* ƒvƒƒOƒ‰ƒ€‚ğI—¹‚·‚é */
  }

  public static void main(String args[]){
    int val1 = 0;  /* Å‰‚Ì”š */
    int val2 = 0;  /* Ÿ‚Ì”š */
    String ope;    /* ‰‰Zq */
    int kekka;     /* Œ‹‰Ê‚ğŠi”[ */

    inputCheck(args);
    valCheck(val1, val2, args);
    ope = args[1];
    opeCheck(ope);
    kekka = calc(val1, val2, ope);

    System.out.println("“ü—Í‚³‚ê‚½®‚Í " + val1 + " " + ope + " " + val2 + " ‚Å‚·");
    System.out.println("ŒvZŒ‹‰Ê‚Í " + kekka + " ‚Å‚·");
  }
}