/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ge
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   public ge() {}
/*    */   
/*    */   public ge(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 20 */     this.a = paramInt1;
/* 21 */     this.b = paramInt2;
/* 22 */     this.c = paramInt3;
/* 23 */     this.d = paramInt4;
/* 24 */     this.e = paramInt5;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 29 */     this.a = paramet.a();
/* 30 */     this.b = paramet.readInt();
/* 31 */     this.c = paramet.readInt();
/* 32 */     this.d = paramet.readInt();
/* 33 */     this.e = paramet.readUnsignedByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 38 */     paramet.b(this.a);
/* 39 */     paramet.writeInt(this.b);
/* 40 */     paramet.writeInt(this.c);
/* 41 */     paramet.writeInt(this.d);
/* 42 */     paramet.writeByte(this.e);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 47 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 51 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 55 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 59 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 63 */     return this.d;
/*    */   }
/*    */   
/*    */   public int g() {
/* 67 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */