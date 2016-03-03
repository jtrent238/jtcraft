/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bmd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   private double d;
/*    */   private double e;
/*    */   private double f;
/* 16 */   private IntBuffer g = ban.f(65536);
/*    */   private boolean h;
/*    */   private boolean i;
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3)
/*    */   {
/* 22 */     this.h = true;
/* 23 */     this.g.clear();
/* 24 */     this.a = paramInt1;
/* 25 */     this.b = paramInt2;
/* 26 */     this.c = paramInt3;
/*    */     
/* 28 */     this.d = paramDouble1;
/* 29 */     this.e = paramDouble2;
/* 30 */     this.f = paramDouble3;
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2, int paramInt3) {
/* 34 */     if (!this.h) return false;
/* 35 */     return (paramInt1 == this.a) && (paramInt2 == this.b) && (paramInt3 == this.c);
/*    */   }
/*    */   
/*    */   public void a(int paramInt) {
/* 39 */     this.g.put(paramInt);
/* 40 */     if (this.g.remaining() == 0) a();
/*    */   }
/*    */   
/*    */   public void a() {
/* 44 */     if (!this.h) return;
/* 45 */     if (!this.i) {
/* 46 */       this.g.flip();
/* 47 */       this.i = true;
/*    */     }
/* 49 */     if (this.g.remaining() > 0) {
/* 50 */       GL11.glPushMatrix();
/* 51 */       GL11.glTranslatef((float)(this.a - this.d), (float)(this.b - this.e), (float)(this.c - this.f));
/* 52 */       GL11.glCallLists(this.g);
/* 53 */       GL11.glPopMatrix();
/*    */     }
/*    */   }
/*    */   
/*    */   public void b() {
/* 58 */     this.h = false;
/* 59 */     this.i = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */