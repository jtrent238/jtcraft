/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnv
/*    */   extends bok
/*    */ {
/* 16 */   private static final Map a = ;
/* 17 */   private static final bqx f = new bqx("textures/entity/horse/horse_white.png");
/* 18 */   private static final bqx g = new bqx("textures/entity/horse/mule.png");
/* 19 */   private static final bqx h = new bqx("textures/entity/horse/donkey.png");
/* 20 */   private static final bqx k = new bqx("textures/entity/horse/horse_zombie.png");
/* 21 */   private static final bqx l = new bqx("textures/entity/horse/horse_skeleton.png");
/*    */   
/*    */   public bnv(bhr parambhr, float paramFloat) {
/* 24 */     super(parambhr, paramFloat);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   protected void a(wi paramwi, float paramFloat)
/*    */   {
/* 33 */     float f1 = 1.0F;
/*    */     
/* 35 */     int i = paramwi.bZ();
/* 36 */     if (i == 1) {
/* 37 */       f1 *= 0.87F;
/* 38 */     } else if (i == 2) {
/* 39 */       f1 *= 0.92F;
/*    */     }
/* 41 */     GL11.glScalef(f1, f1, f1);
/* 42 */     super.a(paramwi, paramFloat);
/*    */   }
/*    */   
/*    */   protected void a(wi paramwi, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 47 */     if (paramwi.ap()) {
/* 48 */       this.i.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwi);
/*    */     } else {
/* 50 */       b(paramwi);
/* 51 */       this.i.a(paramwi, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */     }
/*    */   }
/*    */   
/*    */   protected bqx a(wi paramwi)
/*    */   {
/* 57 */     if (!paramwi.cx()) {
/* 58 */       switch (paramwi.bZ()) {
/*    */       case 0: 
/*    */       default: 
/* 61 */         return f;
/*    */       case 2: 
/* 63 */         return g;
/*    */       case 1: 
/* 65 */         return h;
/*    */       case 3: 
/* 67 */         return k;
/*    */       }
/* 69 */       return l;
/*    */     }
/*    */     
/*    */ 
/* 73 */     return b(paramwi);
/*    */   }
/*    */   
/*    */   private bqx b(wi paramwi) {
/* 77 */     String str = paramwi.cy();
/*    */     
/* 79 */     bqx localbqx = (bqx)a.get(str);
/* 80 */     if (localbqx == null) {
/* 81 */       localbqx = new bqx(str);
/* 82 */       bao.B().P().a(localbqx, new bpt(paramwi.cz()));
/*    */       
/* 84 */       a.put(str, localbqx);
/*    */     }
/*    */     
/* 87 */     return localbqx;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */