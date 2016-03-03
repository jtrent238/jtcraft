/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ik
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private byte e;
/*    */   private byte f;
/*    */   
/*    */   public ik() {}
/*    */   
/*    */   public ik(sa paramsa)
/*    */   {
/* 22 */     this.a = paramsa.y();
/* 23 */     this.b = qh.c(paramsa.s * 32.0D);
/* 24 */     this.c = qh.c(paramsa.t * 32.0D);
/* 25 */     this.d = qh.c(paramsa.u * 32.0D);
/* 26 */     this.e = ((byte)(int)(paramsa.y * 256.0F / 360.0F));
/* 27 */     this.f = ((byte)(int)(paramsa.z * 256.0F / 360.0F));
/*    */   }
/*    */   
/*    */   public ik(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte1, byte paramByte2) {
/* 31 */     this.a = paramInt1;
/* 32 */     this.b = paramInt2;
/* 33 */     this.c = paramInt3;
/* 34 */     this.d = paramInt4;
/* 35 */     this.e = paramByte1;
/* 36 */     this.f = paramByte2;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 41 */     this.a = paramet.readInt();
/* 42 */     this.b = paramet.readInt();
/* 43 */     this.c = paramet.readInt();
/* 44 */     this.d = paramet.readInt();
/* 45 */     this.e = paramet.readByte();
/* 46 */     this.f = paramet.readByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 51 */     paramet.writeInt(this.a);
/* 52 */     paramet.writeInt(this.b);
/* 53 */     paramet.writeInt(this.c);
/* 54 */     paramet.writeInt(this.d);
/* 55 */     paramet.writeByte(this.e);
/* 56 */     paramet.writeByte(this.f);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 61 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 65 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 69 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 73 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 77 */     return this.d;
/*    */   }
/*    */   
/*    */   public byte g() {
/* 81 */     return this.e;
/*    */   }
/*    */   
/*    */   public byte h() {
/* 85 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */