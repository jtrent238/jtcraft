/*    */ 
/*    */ 
/*    */ public class ahm
/*    */ {
/*  5 */   public static final ahm[] a = new ahm[16];
/*    */   
/*  7 */   public static final ahm b = new ahm(0, "default", 1).i();
/*  8 */   public static final ahm c = new ahm(1, "flat");
/*  9 */   public static final ahm d = new ahm(2, "largeBiomes");
/* 10 */   public static final ahm e = new ahm(3, "amplified").j();
/*    */   
/* 12 */   public static final ahm f = new ahm(8, "default_1_1", 0).a(false);
/*    */   private final int g;
/*    */   private final String h;
/*    */   private final int i;
/*    */   private boolean j;
/*    */   private boolean k;
/*    */   private boolean l;
/*    */   
/*    */   private ahm(int paramInt, String paramString)
/*    */   {
/* 22 */     this(paramInt, paramString, 0);
/*    */   }
/*    */   
/*    */   private ahm(int paramInt1, String paramString, int paramInt2) {
/* 26 */     this.h = paramString;
/* 27 */     this.i = paramInt2;
/* 28 */     this.j = true;
/* 29 */     this.g = paramInt1;
/* 30 */     a[paramInt1] = this;
/*    */   }
/*    */   
/*    */   public String a() {
/* 34 */     return this.h;
/*    */   }
/*    */   
/*    */   public String b() {
/* 38 */     return "generator." + this.h;
/*    */   }
/*    */   
/*    */   public String c() {
/* 42 */     return b() + ".info";
/*    */   }
/*    */   
/*    */   public int d() {
/* 46 */     return this.i;
/*    */   }
/*    */   
/*    */   public ahm a(int paramInt) {
/* 50 */     if ((this == b) && (paramInt == 0)) {
/* 51 */       return f;
/*    */     }
/* 53 */     return this;
/*    */   }
/*    */   
/*    */   private ahm a(boolean paramBoolean) {
/* 57 */     this.j = paramBoolean;
/* 58 */     return this;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 62 */     return this.j;
/*    */   }
/*    */   
/*    */   private ahm i() {
/* 66 */     this.k = true;
/* 67 */     return this;
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 71 */     return this.k;
/*    */   }
/*    */   
/*    */   public static ahm a(String paramString) {
/* 75 */     for (int m = 0; m < a.length; m++) {
/* 76 */       if ((a[m] != null) && (a[m].h.equalsIgnoreCase(paramString))) {
/* 77 */         return a[m];
/*    */       }
/*    */     }
/* 80 */     return null;
/*    */   }
/*    */   
/*    */   public int g() {
/* 84 */     return this.g;
/*    */   }
/*    */   
/*    */   public boolean h() {
/* 88 */     return this.l;
/*    */   }
/*    */   
/*    */   private ahm j() {
/* 92 */     this.l = true;
/* 93 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */