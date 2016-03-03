/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
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
/*    */ public class bbx
/*    */ {
/* 17 */   private static final bqx a = new bqx("textures/map/map_icons.png");
/*    */   
/*    */   private final bqf b;
/*    */   
/* 21 */   private final Map c = Maps.newHashMap();
/*    */   
/*    */   public bbx(bqf parambqf) {
/* 24 */     this.b = parambqf;
/*    */   }
/*    */   
/*    */   public void a(ayi paramayi) {
/* 28 */     bbz.a(b(paramayi));
/*    */   }
/*    */   
/*    */   public void a(ayi paramayi, boolean paramBoolean) {
/* 32 */     bbz.a(b(paramayi), paramBoolean);
/*    */   }
/*    */   
/*    */   private bbz b(ayi paramayi) {
/* 36 */     bbz localbbz = (bbz)this.c.get(paramayi.h);
/*    */     
/* 38 */     if (localbbz == null) {
/* 39 */       localbbz = new bbz(this, paramayi, null);
/* 40 */       this.c.put(paramayi.h, localbbz);
/*    */     }
/* 42 */     return localbbz;
/*    */   }
/*    */   
/*    */   public void a() {
/* 46 */     for (bbz localbbz : this.c.values()) {
/* 47 */       this.b.c(bbz.b(localbbz));
/*    */     }
/*    */     
/* 50 */     this.c.clear();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */