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
/*    */ public class ji
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   public ji() {}
/*    */   
/*    */   public ji(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 26 */     this.e = paramInt1;
/* 27 */     this.a = paramInt2;
/* 28 */     this.b = paramInt3;
/* 29 */     this.c = paramInt4;
/* 30 */     this.d = paramInt5;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 35 */     this.e = paramet.readUnsignedByte();
/* 36 */     this.a = paramet.readInt();
/* 37 */     this.b = paramet.readUnsignedByte();
/* 38 */     this.c = paramet.readInt();
/* 39 */     this.d = paramet.readUnsignedByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 44 */     paramet.writeByte(this.e);
/* 45 */     paramet.writeInt(this.a);
/* 46 */     paramet.writeByte(this.b);
/* 47 */     paramet.writeInt(this.c);
/* 48 */     paramet.writeByte(this.d);
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 53 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 57 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 61 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 65 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 69 */     return this.d;
/*    */   }
/*    */   
/*    */   public int g() {
/* 73 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */