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
        errDisp("0 �Ŋ��낤�Ƃ��܂���");
      }

      result = num1 / num2;
    }

    return result;
  }

  public static void inputCheck(String args[]){
    if (args.length != 3){
      errDisp("������3���͂��ĉ�����");
    }
  }

  public static void valCheck(int num1, int num2, String[] args){
    try{
      num1 = Integer.parseInt(args[0]);
      num2 = Integer.parseInt(args[2]);
    }catch(NumberFormatException e){
      errDisp("���l�łȂ��l�����͂���Ă��܂�");
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
      errDisp("���Z�q�� kake waru tasu hiku ��4�ł�");
    }
  }

  private static void errDisp(String errStr){
    System.out.println("Usage : java dentaku ���l ���Z�q ���l");
    System.out.println(errStr);
    System.exit(0);  /* �v���O�������I������ */
  }

  public static void main(String args[]){
    int val1 = 0;  /* �ŏ��̐��� */
    int val2 = 0;  /* ���̐��� */
    String ope;    /* ���Z�q */
    int kekka;     /* ���ʂ��i�[ */

    inputCheck(args);
    valCheck(val1, val2, args);
    ope = args[1];
    opeCheck(ope);
    kekka = calc(val1, val2, ope);

    System.out.println("���͂��ꂽ���� " + val1 + " " + ope + " " + val2 + " �ł�");
    System.out.println("�v�Z���ʂ� " + kekka + " �ł�");
  }
}