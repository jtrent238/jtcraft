/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahy
/*    */ {
/*    */   private final aib a;
/*    */   private long b;
/* 39 */   private qd c = new qd();
/* 40 */   private List d = new ArrayList();
/*    */   
/*    */   public ahy(aib paramaib) {
/* 43 */     this.a = paramaib;
/*    */   }
/*    */   
/*    */   public ahz a(int paramInt1, int paramInt2) {
/* 47 */     paramInt1 >>= 4;
/* 48 */     paramInt2 >>= 4;
/* 49 */     long l = paramInt1 & 0xFFFFFFFF | (paramInt2 & 0xFFFFFFFF) << 32;
/* 50 */     ahz localahz = (ahz)this.c.a(l);
/* 51 */     if (localahz == null) {
/* 52 */       localahz = new ahz(this, paramInt1, paramInt2);
/* 53 */       this.c.a(l, localahz);
/* 54 */       this.d.add(localahz);
/*    */     }
/* 56 */     localahz.e = MinecraftServer.ar();
/* 57 */     return localahz;
/*    */   }
/*    */   
/*    */   public ahu b(int paramInt1, int paramInt2) {
/* 61 */     return a(paramInt1, paramInt2).a(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a()
/*    */   {
/* 69 */     long l1 = MinecraftServer.ar();
/* 70 */     long l2 = l1 - this.b;
/* 71 */     if ((l2 > 7500L) || (l2 < 0L)) {
/* 72 */       this.b = l1;
/*    */       
/* 74 */       for (int i = 0; i < this.d.size(); i++) {
/* 75 */         ahz localahz = (ahz)this.d.get(i);
/* 76 */         long l3 = l1 - localahz.e;
/* 77 */         if ((l3 > 30000L) || (l3 < 0L)) {
/* 78 */           this.d.remove(i--);
/* 79 */           long l4 = localahz.c & 0xFFFFFFFF | (localahz.d & 0xFFFFFFFF) << 32;
/* 80 */           this.c.d(l4);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public ahu[] d(int paramInt1, int paramInt2) {
/* 87 */     return a(paramInt1, paramInt2).b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */