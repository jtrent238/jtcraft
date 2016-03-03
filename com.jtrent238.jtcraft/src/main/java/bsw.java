/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.net.SocketAddress;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsw
/*    */   extends oi
/*    */ {
/*    */   private dh g;
/*    */   
/*    */   public bsw(bsx parambsx)
/*    */   {
/* 14 */     super(parambsx);
/*    */     
/* 16 */     a(10);
/*    */   }
/*    */   
/*    */   protected void b(mw parammw)
/*    */   {
/* 21 */     if (parammw.b_().equals(b().M())) {
/* 22 */       this.g = new dh();
/* 23 */       parammw.e(this.g);
/*    */     }
/*    */     
/* 26 */     super.b(parammw);
/*    */   }
/*    */   
/*    */   public String a(SocketAddress paramSocketAddress, GameProfile paramGameProfile)
/*    */   {
/* 31 */     if ((paramGameProfile.getName().equalsIgnoreCase(b().M())) && (a(paramGameProfile.getName()) != null)) {
/* 32 */       return "That name is already taken.";
/*    */     }
/*    */     
/* 35 */     return super.a(paramSocketAddress, paramGameProfile);
/*    */   }
/*    */   
/*    */   public bsx b()
/*    */   {
/* 40 */     return (bsx)super.c();
/*    */   }
/*    */   
/*    */   public dh t()
/*    */   {
/* 45 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */