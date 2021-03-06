package expo.modules.notifications.notifications.interfaces;

import com.google.firebase.messaging.FirebaseMessagingService;

import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationResponse;

/**
 * Interface used to register in {@link NotificationManager}
 * and be notified of new message events.
 */
public interface NotificationListener {
  /**
   * Callback called when new notification is received.
   *
   * @param notification Notification received
   */
  void onNotificationReceived(Notification notification);

  /**
   * Callback called when new notification response is received.
   *
   * @param response Notification response received
   */
  void onNotificationResponseReceived(NotificationResponse response);

  /**
   * Callback called when some notifications are dropped.
   * See {@link FirebaseMessagingService#onDeletedMessages()}
   */
  void onNotificationsDropped();
}
