/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gg
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   private aji f;
/*    */   
/*    */   public gg() {}
/*    */   
/*    */   public gg(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4, int paramInt5)
/*    */   {
/* 22 */     this.a = paramInt1;
/* 23 */     this.b = paramInt2;
/* 24 */     this.c = paramInt3;
/* 25 */     this.d = paramInt4;
/* 26 */     this.e = paramInt5;
/* 27 */     this.f = paramaji;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 32 */     this.a = paramet.readInt();
/* 33 */     this.b = paramet.readShort();
/* 34 */     this.c = paramet.readInt();
/* 35 */     this.d = paramet.readUnsignedByte();
/* 36 */     this.e = paramet.readUnsignedByte();
/* 37 */     this.f = aji.e(paramet.a() & 0xFFF);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 42 */     paramet.writeInt(this.a);
/* 43 */     paramet.writeShort(this.b);
/* 44 */     paramet.writeInt(this.c);
/* 45 */     paramet.writeByte(this.d);
/* 46 */     paramet.writeByte(this.e);
/* 47 */     paramet.b(aji.b(this.f) & 0xFFF);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 52 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public aji c() {
/* 56 */     return this.f;
/*    */   }
/*    */   
/*    */   public int d() {
/* 60 */     return this.a;
/*    */   }
/*    */   
/*    */   public int e() {
/* 64 */     return this.b;
/*    */   }
/*    */   
/*    */   public int f() {
/* 68 */     return this.c;
/*    */   }
/*    */   
/*    */   public int g() {
/* 72 */     return this.d;
/*    */   }
/*    */   
/*    */   public int h() {
/* 76 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */