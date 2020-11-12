package br.com.mardonio.domain;

public class Multa {
	  private String TIPO;
	  private String TOTAL_ANO;
	  private int JAN;
	  private int FEV;
	  private int MAR;
	  private int ABR;
	  private int MAI;
	  private int JUN;
	  private int JUL;
	  private int AGO;
	  private int SET;
	  private int OUT;
	  private int NOV;
	  private int DEZ;

	  public Multa(String tIPO, String tOTAL_ANO, int jAN, int fEV, int mAR, int aBR, int mAI, int jUN, int jUL, int aGO,
	      int sET, int oUT, int nOV, int dEZ) {
	    TIPO = tIPO;
	    TOTAL_ANO = tOTAL_ANO;
	    JAN = jAN;
	    FEV = fEV;
	    MAR = mAR;
	    ABR = aBR;
	    MAI = mAI;
	    JUN = jUN;
	    JUL = jUL;
	    AGO = aGO;
	    SET = sET;
	    OUT = oUT;
	    NOV = nOV;
	    DEZ = dEZ;
	  }

	  public Multa() {
	  }

	  public String getTIPO() {
	    return TIPO;
	  }

	  public void setTIPO(String tIPO) {
	    TIPO = tIPO;
	  }

	  public String getTOTAL_ANO() {
	    return TOTAL_ANO;
	  }

	  public void setTOTAL_ANO(String tOTAL_ANO) {
	    TOTAL_ANO = tOTAL_ANO;
	  }

	  public int getJAN() {
	    return JAN;
	  }

	  public void setJAN(int jAN) {
	    JAN = jAN;
	  }

	  public int getFEV() {
	    return FEV;
	  }

	  public void setFEV(int fEV) {
	    FEV = fEV;
	  }

	  public int getMAR() {
	    return MAR;
	  }

	  public void setMAR(int mAR) {
	    MAR = mAR;
	  }

	  public int getABR() {
	    return ABR;
	  }

	  public void setABR(int aBR) {
	    ABR = aBR;
	  }

	  public int getMAI() {
	    return MAI;
	  }

	  public void setMAI(int mAI) {
	    MAI = mAI;
	  }

	  public int getJUN() {
	    return JUN;
	  }

	  public void setJUN(int jUN) {
	    JUN = jUN;
	  }

	  public int getJUL() {
	    return JUL;
	  }

	  public void setJUL(int jUL) {
	    JUL = jUL;
	  }

	  public int getAGO() {
	    return AGO;
	  }

	  public void setAGO(int aGO) {
	    AGO = aGO;
	  }

	  public int getSET() {
	    return SET;
	  }

	  public void setSET(int sET) {
	    SET = sET;
	  }

	  public int getOUT() {
	    return OUT;
	  }

	  public void setOUT(int oUT) {
	    OUT = oUT;
	  }

	  public int getNOV() {
	    return NOV;
	  }

	  public void setNOV(int nOV) {
	    NOV = nOV;
	  }

	  public int getDEZ() {
	    return DEZ;
	  }

	  public void setDEZ(int dEZ) {
	    DEZ = dEZ;
	  }
}