/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apm
/*    */   extends aor
/*    */ {
/* 12 */   public String[] a = { "", "", "", "" };
/*    */   
/*    */ 
/* 15 */   public int i = -1;
/* 16 */   private boolean j = true;
/*    */   private yz k;
/*    */   
/*    */   public void b(dh paramdh)
/*    */   {
/* 21 */     super.b(paramdh);
/* 22 */     paramdh.a("Text1", this.a[0]);
/* 23 */     paramdh.a("Text2", this.a[1]);
/* 24 */     paramdh.a("Text3", this.a[2]);
/* 25 */     paramdh.a("Text4", this.a[3]);
/*    */   }
/*    */   
/*    */   public void a(dh paramdh)
/*    */   {
/* 30 */     this.j = false;
/* 31 */     super.a(paramdh);
/* 32 */     for (int m = 0; m < 4; m++) {
/* 33 */       this.a[m] = paramdh.j("Text" + (m + 1));
/* 34 */       if (this.a[m].length() > 15) this.a[m] = this.a[m].substring(0, 15);
/*    */     }
/*    */   }
/*    */   
/*    */   public ft m()
/*    */   {
/* 40 */     String[] arrayOfString = new String[4];
/* 41 */     System.arraycopy(this.a, 0, arrayOfString, 0, 4);
/* 42 */     return new ii(this.c, this.d, this.e, arrayOfString);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 46 */     return this.j;
/*    */   }
/*    */   
/*    */   public void a(boolean paramBoolean) {
/* 50 */     this.j = paramBoolean;
/* 51 */     if (!paramBoolean) {
/* 52 */       this.k = null;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(yz paramyz) {
/* 57 */     this.k = paramyz;
/*    */   }
/*    */   
/*    */   public yz b() {
/* 61 */     return this.k;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */