/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bjn
/*    */ {
/*    */   public String a;
/*    */   public String b;
/*    */   public String c;
/*    */   public String d;
/*    */   public long e;
/* 15 */   public int f = 5;
/* 16 */   public String g = "1.7.10";
/*    */   public boolean h;
/*    */   public String i;
/* 19 */   private bjo j = bjo.c;
/*    */   private String k;
/*    */   private boolean l;
/*    */   
/*    */   public bjn(String paramString1, String paramString2) {
/* 24 */     this.a = paramString1;
/* 25 */     this.b = paramString2;
/*    */   }
/*    */   
/*    */   public bjn(String paramString1, String paramString2, boolean paramBoolean) {
/* 29 */     this(paramString1, paramString2);
/*    */     
/* 31 */     this.l = paramBoolean;
/*    */   }
/*    */   
/*    */   public dh a() {
/* 35 */     dh localdh = new dh();
/* 36 */     localdh.a("name", this.a);
/* 37 */     localdh.a("ip", this.b);
/*    */     
/* 39 */     if (this.k != null) {
/* 40 */       localdh.a("icon", this.k);
/*    */     }
/*    */     
/* 43 */     if (this.j == bjo.a) {
/* 44 */       localdh.a("acceptTextures", true);
/* 45 */     } else if (this.j == bjo.b) {
/* 46 */       localdh.a("acceptTextures", false);
/*    */     }
/*    */     
/* 49 */     return localdh;
/*    */   }
/*    */   
/*    */   public bjo b() {
/* 53 */     return this.j;
/*    */   }
/*    */   
/*    */   public void a(bjo parambjo) {
/* 57 */     this.j = parambjo;
/*    */   }
/*    */   
/*    */   public static bjn a(dh paramdh) {
/* 61 */     bjn localbjn = new bjn(paramdh.j("name"), paramdh.j("ip"));
/*    */     
/* 63 */     if (paramdh.b("icon", 8)) {
/* 64 */       localbjn.a(paramdh.j("icon"));
/*    */     }
/*    */     
/* 67 */     if (paramdh.b("acceptTextures", 1)) {
/* 68 */       if (paramdh.n("acceptTextures")) {
/* 69 */         localbjn.a(bjo.a);
/*    */       } else {
/* 71 */         localbjn.a(bjo.b);
/*    */       }
/*    */     } else {
/* 74 */       localbjn.a(bjo.c);
/*    */     }
/*    */     
/* 77 */     return localbjn;
/*    */   }
/*    */   
/*    */   public String c() {
/* 81 */     return this.k;
/*    */   }
/*    */   
/*    */   public void a(String paramString) {
/* 85 */     this.k = paramString;
/*    */   }
/*    */   
/*    */   public void a(bjn parambjn) {
/* 89 */     this.b = parambjn.b;
/* 90 */     this.a = parambjn.a;
/* 91 */     a(parambjn.b());
/* 92 */     this.k = parambjn.k;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 96 */     return this.l;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */