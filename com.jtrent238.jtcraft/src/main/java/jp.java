/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jp
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private String b;
/*    */   private int c;
/*    */   private eo d;
/*    */   
/*    */   public jp() {}
/*    */   
/*    */   public jp(int paramInt1, String paramString, int paramInt2, eo parameo)
/*    */   {
/* 24 */     this.a = paramInt1;
/* 25 */     this.b = paramString;
/* 26 */     this.c = paramInt2;
/* 27 */     this.d = parameo;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 32 */     this.a = paramet.a();
/* 33 */     this.b = paramet.c(255);
/* 34 */     this.c = paramet.readUnsignedShort();
/* 35 */     this.d = eo.a(paramet.a());
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 40 */     paramet.b(this.a);
/* 41 */     paramet.a(this.b);
/* 42 */     paramet.writeShort(this.c);
/* 43 */     paramet.b(this.d.c());
/*    */   }
/*    */   
/*    */   public void a(jq paramjq)
/*    */   {
/* 48 */     paramjq.a(this);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 53 */     return true;
/*    */   }
/*    */   
/*    */   public eo c() {
/* 57 */     return this.d;
/*    */   }
/*    */   
/*    */   public int d() {
/* 61 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */