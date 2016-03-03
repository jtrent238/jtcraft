/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class na
/*    */   implements jq
/*    */ {
/*    */   private final MinecraftServer a;
/*    */   private final ej b;
/*    */   
/*    */   public na(MinecraftServer paramMinecraftServer, ej paramej)
/*    */   {
/* 16 */     this.a = paramMinecraftServer;
/* 17 */     this.b = paramej;
/*    */   }
/*    */   
/*    */   public void a(jp paramjp)
/*    */   {
/* 22 */     this.b.a(paramjp.c());
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void a(fj paramfj) {}
/*    */   
/*    */ 
/*    */   public void a(eo parameo1, eo parameo2)
/*    */   {
/* 32 */     Validate.validState((parameo2 == eo.d) || (parameo2 == eo.c), "Unexpected protocol " + parameo2, new Object[0]);
/* 33 */     switch (nb.a[parameo2.ordinal()]) {
/*    */     case 1: 
/* 35 */       this.b.a(new nn(this.a, this.b));
/* 36 */       break;
/*    */     case 2: 
/* 38 */       throw new UnsupportedOperationException("NYI");
/*    */     }
/*    */   }
/*    */   
/*    */   public void a() {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\na.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */