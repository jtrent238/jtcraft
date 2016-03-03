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
/*    */ 
/*    */ public class fy
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   public fy() {}
/*    */   
/*    */   public fy(sa paramsa)
/*    */   {
/* 26 */     this.a = paramsa.y();
/* 27 */     this.b = qh.c(paramsa.s * 32.0D);
/* 28 */     this.c = qh.c(paramsa.t * 32.0D);
/* 29 */     this.d = qh.c(paramsa.u * 32.0D);
/* 30 */     if ((paramsa instanceof xh)) {
/* 31 */       this.e = 1;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 37 */     this.a = paramet.a();
/* 38 */     this.e = paramet.readByte();
/* 39 */     this.b = paramet.readInt();
/* 40 */     this.c = paramet.readInt();
/* 41 */     this.d = paramet.readInt();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 46 */     paramet.b(this.a);
/* 47 */     paramet.writeByte(this.e);
/* 48 */     paramet.writeInt(this.b);
/* 49 */     paramet.writeInt(this.c);
/* 50 */     paramet.writeInt(this.d);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 55 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 60 */     return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.e), Float.valueOf(this.b / 32.0F), Float.valueOf(this.c / 32.0F), Float.valueOf(this.d / 32.0F) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 64 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 68 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 72 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 76 */     return this.d;
/*    */   }
/*    */   
/*    */   public int g() {
/* 80 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */