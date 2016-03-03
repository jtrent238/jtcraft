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
/*    */ 
/*    */ 
/*    */ public class gf
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private dh e;
/*    */   
/*    */   public gf() {}
/*    */   
/*    */   public gf(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dh paramdh)
/*    */   {
/* 28 */     this.a = paramInt1;
/* 29 */     this.b = paramInt2;
/* 30 */     this.c = paramInt3;
/* 31 */     this.d = paramInt4;
/* 32 */     this.e = paramdh;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 37 */     this.a = paramet.readInt();
/* 38 */     this.b = paramet.readShort();
/* 39 */     this.c = paramet.readInt();
/* 40 */     this.d = paramet.readUnsignedByte();
/* 41 */     this.e = paramet.b();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 46 */     paramet.writeInt(this.a);
/* 47 */     paramet.writeShort(this.b);
/* 48 */     paramet.writeInt(this.c);
/* 49 */     paramet.writeByte((byte)this.d);
/* 50 */     paramet.a(this.e);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 55 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 59 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 63 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 67 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 71 */     return this.d;
/*    */   }
/*    */   
/*    */   public dh g() {
/* 75 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */