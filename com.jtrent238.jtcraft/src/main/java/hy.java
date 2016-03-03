/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hy
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   
/*    */   public hy() {}
/*    */   
/*    */   public hy(sa paramsa)
/*    */   {
/* 19 */     this(paramsa.y(), paramsa.v, paramsa.w, paramsa.x);
/*    */   }
/*    */   
/*    */   public hy(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 23 */     this.a = paramInt;
/* 24 */     double d1 = 3.9D;
/* 25 */     if (paramDouble1 < -d1) paramDouble1 = -d1;
/* 26 */     if (paramDouble2 < -d1) paramDouble2 = -d1;
/* 27 */     if (paramDouble3 < -d1) paramDouble3 = -d1;
/* 28 */     if (paramDouble1 > d1) paramDouble1 = d1;
/* 29 */     if (paramDouble2 > d1) paramDouble2 = d1;
/* 30 */     if (paramDouble3 > d1) paramDouble3 = d1;
/* 31 */     this.b = ((int)(paramDouble1 * 8000.0D));
/* 32 */     this.c = ((int)(paramDouble2 * 8000.0D));
/* 33 */     this.d = ((int)(paramDouble3 * 8000.0D));
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 38 */     this.a = paramet.readInt();
/* 39 */     this.b = paramet.readShort();
/* 40 */     this.c = paramet.readShort();
/* 41 */     this.d = paramet.readShort();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 46 */     paramet.writeInt(this.a);
/* 47 */     paramet.writeShort(this.b);
/* 48 */     paramet.writeShort(this.c);
/* 49 */     paramet.writeShort(this.d);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 54 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 59 */     return String.format("id=%d, x=%.2f, y=%.2f, z=%.2f", new Object[] { Integer.valueOf(this.a), Float.valueOf(this.b / 8000.0F), Float.valueOf(this.c / 8000.0F), Float.valueOf(this.d / 8000.0F) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 63 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 67 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 71 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 75 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */